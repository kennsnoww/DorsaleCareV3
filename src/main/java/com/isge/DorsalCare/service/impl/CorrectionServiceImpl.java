package com.isge.DorsalCare.service.impl;

import com.isge.DorsalCare.dto.CorrectionDTO;
import com.isge.DorsalCare.model.Correction;
import com.isge.DorsalCare.model.Users;
import com.isge.DorsalCare.repository.CorrectionRepository;
import com.isge.DorsalCare.repository.UserRepository;
import com.isge.DorsalCare.service.CorrectionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public abstract class CorrectionServiceImpl implements CorrectionService {

    @Autowired
    private CorrectionRepository correctionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CorrectionDTO createCorrection(Long userId, CorrectionDTO correctionDTO) {
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable avec l'ID " + userId));

        Correction correction = modelMapper.map(correctionDTO, Correction.class);
        correction.setUser(user);

        Correction savedCorrection = correctionRepository.save(correction);
        return modelMapper.map(savedCorrection, CorrectionDTO.class);
    }

    @Override
    public List<CorrectionDTO> getAllCorrectionsByUserId(Long userId) {
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable avec l'ID " + userId));

        List<Correction> corrections = user.getCorrections();
        return corrections.stream()
                .map(correction -> modelMapper.map(correction, CorrectionDTO.class))
                .collect(Collectors.toList());
    }


    public List<CorrectionDTO> getCorrectionsByDateRange(Long userId, Date startDate, Date endDate) {
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable avec l'ID " + userId));

        List<Correction> corrections = correctionRepository.findByUserAndDateBetween(user, startDate, endDate);
        return corrections.stream()
                .map(correction -> modelMapper.map(correction, CorrectionDTO.class))
                .collect(Collectors.toList());
    }


    @Override
    public void deleteCorrection(Long id) {
        correctionRepository.deleteById(id);
    }



}
