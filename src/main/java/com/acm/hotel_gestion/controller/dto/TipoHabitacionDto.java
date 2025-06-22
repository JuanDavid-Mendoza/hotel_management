package com.acm.hotel_gestion.controller.dto;

import com.acm.hotel_gestion.persistence.entities.HotelEntity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TipoHabitacionDto {
    @Min(value = 1, message = "El id debe ser mayor a 0")
    private Long id;

    @Size(min = 1, max = 100, message = "El nombre debe tener de 1 a 100 caracteres")
    private String nombre;

    @Min(value = 1, message = "la cantidad debe ser mayor a 0")
    private Integer cantidad;

    private Long idhotel;
}
