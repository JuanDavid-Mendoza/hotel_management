package com.acm.hotel_gestion.controller.dto;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpleadoDto {
    @Min(value = 1, message = "El id debe ser mayor a 0")
    private Long id;

    @Size(min = 1, max = 100, message = "El correo debe tener de 1 a 100 caracteres")
    @Email(message = "El correo no es válido")
    private String correo;

    @Size(min = 10, max = 10, message = "El telefono debe tener 10 digitos")
    private String telefono;

    @Size(min = 1, max = 50, message = "El primer nombre debe tener de 1 a 50 caracteres")
    private String primerNombre;

    @Pattern(regexp = "^$|^.{1,50}$", message = "El segundo nombre debe tener entre 1 y 50 caracteres si se proporciona")
    private String segundoNombre;

    @Size(min = 1, max = 50, message = "El primer apellido debe tener de 1 a 50 caracteres")
    private String primerApellido;


    @Pattern(regexp = "^$|^.{1,50}$", message = "El segundo apellido debe tener entre 1 y 50 caracteres si se proporciona")
    private String segundoApellido;
}
