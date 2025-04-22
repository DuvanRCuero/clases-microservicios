package com.microservicio.gimnasio.clase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Miembro {

    private Long id;
    private String nombre;
    private String apellido;
    private Date fechaDeRegistro;
    private String email;
    private Long telefono;



}


