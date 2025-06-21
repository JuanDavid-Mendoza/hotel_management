package com.acm.hotel_gestion.controller.dto;

import com.acm.hotel_gestion.persistence.entities.HotelEntity;
import com.acm.hotel_gestion.persistence.entities.TipoHabitacionEntity;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HabitacionDto {
    @Min(value = 1, message = "El id debe ser mayor que a 0")
    private Long id;

    @Min(value = 1, message = "El numero de habitacion debe ser mayor que 0")
    private Integer numeroHabitacion;

    @Min(value = 1, message = "El precio por día debe ser mayor a 0")
    private Integer precioDia;

    private Boolean disponible;

    private HotelEntity hotel;

    private TipoHabitacionEntity tipoHabitacion;
}
