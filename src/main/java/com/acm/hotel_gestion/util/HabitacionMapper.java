package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.HabitacionDto;
import com.acm.hotel_gestion.models.HabitacionModel;
import com.acm.hotel_gestion.models.HotelModel;
import com.acm.hotel_gestion.models.TipoHabitacionModel;
import com.acm.hotel_gestion.persistence.entities.HabitacionEntity;
import com.acm.hotel_gestion.persistence.entities.HotelEntity;
import com.acm.hotel_gestion.persistence.entities.TipoHabitacionEntity;

public class HabitacionMapper {
    public static HabitacionDto modelToDto(HabitacionModel habitacion){
       return HabitacionDto.builder()
               .id(habitacion.getId())
               .numeroHabitacion(habitacion.getNumeroHabitacion())
               .precioDia(habitacion.getPrecioDia())
               .disponible(habitacion.getDisponible())
               .idhotel(HotelModel.builder().id(habitacion.getHotelID()).build().getId())
               .idTipoHabitacion(TipoHabitacionModel.builder().id(habitacion.getTipoHabitacionID()).build().getId())
               .build();
    }
    public static HabitacionModel dtoToModel(HabitacionDto habitacion){
        return HabitacionModel.builder()
                .id(habitacion.getId())
                .numeroHabitacion(habitacion.getNumeroHabitacion())
                .precioDia(habitacion.getPrecioDia())
                .disponible(habitacion.getDisponible())
                .hotelID(habitacion.getIdhotel())
                .tipoHabitacionID(habitacion.getIdTipoHabitacion())
                .build();
    }
    public static HabitacionEntity modelToEntity(HabitacionModel habitacion){
        return HabitacionEntity.builder()
                .id(habitacion.getId())
                .numeroHabitacion(habitacion.getNumeroHabitacion())
                .precioDia(habitacion.getPrecioDia())
                .disponible(habitacion.getDisponible())
                .hotel(HotelEntity.builder().id(habitacion.getHotelID()).build())
                .tipoHabitacion(TipoHabitacionEntity.builder().id(habitacion.getTipoHabitacionID()).build())
                .build();
    }
    public static HabitacionModel entityToModel(HabitacionEntity habitacion){
        return HabitacionModel.builder()
                .id(habitacion.getId())
                .numeroHabitacion(habitacion.getNumeroHabitacion())
                .precioDia(habitacion.getPrecioDia())
                .disponible(habitacion.getDisponible())
                .hotelID(habitacion.getHotel().getId())
                .tipoHabitacionID(habitacion.getTipoHabitacion().getId())
                .build();
    }
}
