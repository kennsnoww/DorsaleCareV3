package com.isge.DorsalCare.service;
import com.isge.DorsalCare.dto.CorrectionDTO;

import java.util.Date;
import java.util.List;
public interface CorrectionService {

    CorrectionDTO createCorrection(Long userId, CorrectionDTO correctionDTO);

    List<CorrectionDTO> getAllCorrectionsByUserId(Long userId);

    static List<CorrectionDTO> getCorrectionsByDateRange(Long userId, Date startDate, Date endDate) {
        return null;
    }


    //List<CorrectionDTO> getCorrectionsByDateRange(Long userId, Date startDate, Date endDate);

    void deleteCorrection(Long id);
}
