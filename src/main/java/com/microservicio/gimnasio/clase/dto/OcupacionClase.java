package com.microservicio.gimnasio.clase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class OcupacionClase {

    private String claseId;
    private int ocupacionActual;
    private LocalDateTime hora;


    public OcupacionClase(String claseId, int ocupacionActual, LocalDateTime now) {

    }
}
