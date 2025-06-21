package com.acm.hotel_gestion.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmpleadoModel {
    private Long id;
    private String correo;
    private String telefono;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
}
