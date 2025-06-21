package com.acm.hotel_gestion.controller.dto;

import com.acm.hotel_gestion.persistence.entities.ClienteEntity;
import com.acm.hotel_gestion.persistence.entities.HabitacionEntity;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class ReservaDto {
    @Min(value = 1, message = "El id debe ser mayor a 0")
    private Long id;

    private Timestamp fechaInicio;

    private Timestamp fechaFinal;

    private Integer cantidadDias;

    private Boolean estado;

    private Timestamp fechaReserva;

    private HabitacionEntity habitacion;

    private ClienteEntity cliente;
}
