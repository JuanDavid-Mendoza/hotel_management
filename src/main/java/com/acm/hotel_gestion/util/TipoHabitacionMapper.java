package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.TipoHabitacionDto;
import com.acm.hotel_gestion.models.HotelModel;
import com.acm.hotel_gestion.models.TipoHabitacionModel;
import com.acm.hotel_gestion.persistence.entities.HotelEntity;
import com.acm.hotel_gestion.persistence.entities.TipoHabitacionEntity;

public class TipoHabitacionMapper {
    public static TipoHabitacionDto modelToDto(TipoHabitacionModel tipoHabitacion) {
        return TipoHabitacionDto.builder()
                .id(tipoHabitacion.getId())
                .nombre(tipoHabitacion.getNombre())
                .cantidad(tipoHabitacion.getCantidad())
                .idhotel(HotelModel.builder().id(tipoHabitacion.getHotelID()).build().getId())
                .build();
    }

    public static TipoHabitacionModel dtoToModel(TipoHabitacionDto tipoHabitacion) {
        return TipoHabitacionModel.builder()
                .id(tipoHabitacion.getId())
                .nombre(tipoHabitacion.getNombre())
                .cantidad(tipoHabitacion.getCantidad())
                .hotelID(tipoHabitacion.getIdhotel())
                .build();
    }

    public static TipoHabitacionEntity modelToEntity(TipoHabitacionModel tipoHabitacion) {
        return TipoHabitacionEntity.builder()
                .id(tipoHabitacion.getId())
                .nombre(tipoHabitacion.getNombre())
                .cantidad(tipoHabitacion.getCantidad())
                .hotel(HotelEntity.builder().id(tipoHabitacion.getHotelID()).build())
                .build();
    }

    public static TipoHabitacionModel entityToModel(TipoHabitacionEntity tipoHabitacion) {
        return TipoHabitacionModel.builder()
                .id(tipoHabitacion.getId())
                .nombre(tipoHabitacion.getNombre())
                .cantidad(tipoHabitacion.getCantidad())
                .hotelID(tipoHabitacion.getHotel().getId())
                .build();
    }
}
