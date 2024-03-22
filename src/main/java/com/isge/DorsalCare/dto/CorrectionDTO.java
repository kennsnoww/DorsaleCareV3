package com.isge.DorsalCare.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CorrectionDTO {
    private Long id;
    private double value;
    private Date date;
    private Long userId; // For referencing user by ID in the DTO
}