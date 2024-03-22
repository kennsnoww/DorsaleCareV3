package com.isge.DorsalCare.repository;

import com.isge.DorsalCare.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}

