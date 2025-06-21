package com.acm.hotel_gestion.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDto {
    @Min(value = 1, message = "El id debe ser mayor a 0")
    private Long id;

    @Size(min = 1, max = 50, message = "El primer nombre debe tener de 1 a 50 caracteres")
    private String primerNombre;

    @Pattern(regexp = "^$|^.{1,50}$", message = "El segundo nombre debe tener entre 1 y 50 caracteres si se proporciona")
    private String segundoNombre;

    @Size(min = 1, max = 50, message = "El primer apellido debe tener de 1 a 50 caracteres")
    private String primerApellido;


    @Pattern(regexp = "^$|^.{1,50}$", message = "El segundo apellido debe tener entre 1 y 50 caracteres si se proporciona")
    private String segundoApellido;

    @Min(value = 1, message = "La cedula debe ser mayor a 0")
    private Integer cedula;

    @Size(min = 1, max = 150, message = "La dirección debe tener de 1 a 150 caracteres")
    private String direccion;
}
