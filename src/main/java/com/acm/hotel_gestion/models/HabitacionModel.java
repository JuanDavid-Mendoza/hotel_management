package com.acm.hotel_gestion.models;


import com.acm.hotel_gestion.persistence.entities.HotelEntity;
import com.acm.hotel_gestion.persistence.entities.TipoHabitacionEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HabitacionModel {
    private Long id;
    private Integer numeroHabitacion;
    private Integer precioDia;
    private Boolean disponible;
    private HotelEntity hotel;
    private TipoHabitacionEntity tipoHabitacion;
}
