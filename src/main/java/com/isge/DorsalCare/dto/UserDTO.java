package com.isge.DorsalCare.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    // Méthode pour définir le mot de passe
    // Méthode pour récupérer le mot de passe
    @Setter
    @Getter
    private String password;
    private List<CorrectionDTO> corrections;


}
