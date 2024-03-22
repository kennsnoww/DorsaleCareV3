package com.isge.DorsalCare.model;
import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
public class Correction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double value;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;
}
