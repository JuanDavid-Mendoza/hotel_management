package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.HabitacionDto;
import com.acm.hotel_gestion.models.HabitacionModel;
import com.acm.hotel_gestion.persistence.entities.HabitacionEntity;

public class HabitacionMapper {
    public static HabitacionDto modelToDTO(HabitacionModel habitacion){
       return HabitacionDto.builder()
               .id(habitacion.getId())
               .numeroHabitacion(habitacion.getNumeroHabitacion())
               .precioDia(habitacion.getPrecioDia())
               .disponible(habitacion.getDisponible())
               .hotel(habitacion.getHotel())
               .tipoHabitacion(habitacion.getTipoHabitacion())
               .build();
    }
    public static HabitacionModel dtoToModel(HabitacionDto habitacion){
        return HabitacionModel.builder()
                .id(habitacion.getId())
                .numeroHabitacion(habitacion.getNumeroHabitacion())
                .precioDia(habitacion.getPrecioDia())
                .disponible(habitacion.getDisponible())
                .hotel(habitacion.getHotel())
                .tipoHabitacion(habitacion.getTipoHabitacion())
                .build();
    }
    public static HabitacionEntity modelToEntity(HabitacionModel habitacion){
        return HabitacionEntity.builder()
                .id(habitacion.getId())
                .numeroHabitacion(habitacion.getNumeroHabitacion())
                .precioDia(habitacion.getPrecioDia())
                .disponible(habitacion.getDisponible())
                .hotel(habitacion.getHotel())
                .tipoHabitacion(habitacion.getTipoHabitacion())
                .build();
    }
    public static HabitacionModel entityToModel(HabitacionEntity habitacion){
        return HabitacionModel.builder()
                .id(habitacion.getId())
                .numeroHabitacion(habitacion.getNumeroHabitacion())
                .precioDia(habitacion.getPrecioDia())
                .disponible(habitacion.getDisponible())
                .hotel(habitacion.getHotel())
                .tipoHabitacion(habitacion.getTipoHabitacion())
                .build();
    }
}
