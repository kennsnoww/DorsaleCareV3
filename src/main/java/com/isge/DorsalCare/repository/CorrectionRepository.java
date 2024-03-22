package com.isge.DorsalCare.repository;

import com.isge.DorsalCare.model.Correction;
import com.isge.DorsalCare.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface CorrectionRepository extends JpaRepository<Correction, Long> {
    List<Correction> findByUserAndDateBetween(Users user, Date startDate, Date endDate);

}
