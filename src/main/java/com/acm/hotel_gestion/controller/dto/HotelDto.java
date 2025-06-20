package com.acm.hotel_gestion.controller.dto;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HotelDto {
    @Min(value = 1, message = "El id debe ser mayor a 0")
    private Long id;

    @Size(min = 1, max = 30, message = "El nombre debe tener de 1 a 30 caracteres")
    private String nombre;

    @Size(min = 1, max = 20, message = "La ciudad debe tener de 1 a 20 caracteres")
    private String ciudad;

    @Size(min = 10, max = 10, message = "El telefono debe tener 10 digitos")
    private String telefono;

    @Size(min = 1, max = 100, message = "El correo debe tener de 1 a 100 caracteres")
    @Email(message = "El correo no es válido")
    private String correo;

    @Size(min = 1, max = 200, message = "La dirección debe tener de 1 a 200 caracteres")
    private String direccion;
}
