package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.TipoHabitacionDto;
import com.acm.hotel_gestion.models.TipoHabitacionModel;
import com.acm.hotel_gestion.persistence.entities.TipoHabitacionEntity;

public class TipoHabitacionMapper {
    public static TipoHabitacionDto modelToDto(TipoHabitacionModel tipoHabitacion) {
        return TipoHabitacionDto.builder()
                .id(tipoHabitacion.getId())
                .nombre(tipoHabitacion.getNombre())
                .cantidad(tipoHabitacion.getCantidad())
                .hotel(tipoHabitacion.getHotel())
                .build();
    }

    public static TipoHabitacionModel dtoToModel(TipoHabitacionDto tipoHabitacion) {
        return TipoHabitacionModel.builder()
                .id(tipoHabitacion.getId())
                .nombre(tipoHabitacion.getNombre())
                .cantidad(tipoHabitacion.getCantidad())
                .hotel(tipoHabitacion.getHotel())
                .build();
    }

    public static TipoHabitacionEntity modelToEntity(TipoHabitacionModel tipoHabitacion) {
        return TipoHabitacionEntity.builder()
                .id(tipoHabitacion.getId())
                .nombre(tipoHabitacion.getNombre())
                .cantidad(tipoHabitacion.getCantidad())
                .hotel(tipoHabitacion.getHotel())
                .build();
    }

    public static TipoHabitacionModel entityToModel(TipoHabitacionEntity tipoHabitacion) {
        return TipoHabitacionModel.builder()
                .id(tipoHabitacion.getId())
                .nombre(tipoHabitacion.getNombre())
                .cantidad(tipoHabitacion.getCantidad())
                .hotel(tipoHabitacion.getHotel())
                .build();
    }
}
