package com.microservicio.gimnasio.clase.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Asistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long miembroId;
    private Long claseId;
    private Date fechaInscripción;


    public Asistente(Long miembroId, Long claseId, Date date) {

    }
}
