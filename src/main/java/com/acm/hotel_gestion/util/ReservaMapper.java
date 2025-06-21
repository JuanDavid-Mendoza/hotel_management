package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.ReservaDto;
import com.acm.hotel_gestion.models.ReservaModel;
import com.acm.hotel_gestion.persistence.entities.ReservaEntity;

public class ReservaMapper {
    public static ReservaDto modelToDto(ReservaModel reserva){
        return ReservaDto.builder()
                .id(reserva.getId())
                .fechaInicio(reserva.getFechaInicio())
                .fechaFinal(reserva.getFechaFinal())
                .cantidadDias(reserva.getCantidadDias())
                .estado(reserva.getEstado())
                .fechaReserva(reserva.getFechaReserva())
                .habitacion(reserva.getHabitacion())
                .cliente(reserva.getCliente())
                .build();
    }
    public static ReservaModel dtoToModel(ReservaDto reserva){
        return ReservaModel.builder()
                .id(reserva.getId())
                .fechaInicio(reserva.getFechaInicio())
                .fechaFinal(reserva.getFechaFinal())
                .cantidadDias(reserva.getCantidadDias())
                .estado(reserva.getEstado())
                .fechaReserva(reserva.getFechaReserva())
                .habitacion(reserva.getHabitacion())
                .cliente(reserva.getCliente())
                .build();
    }
    public static ReservaEntity modelToEntity(ReservaModel reserva){
        return ReservaEntity.builder()
                .id(reserva.getId())
                .fechaInicio(reserva.getFechaInicio())
                .fechaFinal(reserva.getFechaFinal())
                .cantidadDias(reserva.getCantidadDias())
                .estado(reserva.getEstado())
                .fechaReserva(reserva.getFechaReserva())
                .habitacion(reserva.getHabitacion())
                .cliente(reserva.getCliente())
                .build();
    }
    public static ReservaModel entityToModel(ReservaEntity reserva){
        return ReservaModel.builder()
                .id(reserva.getId())
                .fechaInicio(reserva.getFechaInicio())
                .fechaFinal(reserva.getFechaFinal())
                .cantidadDias(reserva.getCantidadDias())
                .estado(reserva.getEstado())
                .fechaReserva(reserva.getFechaReserva())
                .habitacion(reserva.getHabitacion())
                .cliente(reserva.getCliente())
                .build();
    }
}
