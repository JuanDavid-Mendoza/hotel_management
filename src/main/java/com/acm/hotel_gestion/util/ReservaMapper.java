package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.ReservaDto;
import com.acm.hotel_gestion.models.ClienteModel;
import com.acm.hotel_gestion.models.HabitacionModel;
import com.acm.hotel_gestion.models.ReservaModel;
import com.acm.hotel_gestion.persistence.entities.ClienteEntity;
import com.acm.hotel_gestion.persistence.entities.HabitacionEntity;
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
                .idhabitacion(HabitacionModel.builder().id(reserva.getHabitacionID()).build().getId())
                .idcliente(ClienteModel.builder().id(reserva.getClienteID()).build().getId())
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
                .habitacionID(reserva.getIdhabitacion())
                .clienteID(reserva.getIdcliente())
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
                .habitacion(HabitacionEntity.builder().id(reserva.getHabitacionID()).build())
                .cliente(ClienteEntity.builder().id(reserva.getClienteID()).build())
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
                .habitacionID(reserva.getHabitacion().getId())
                .clienteID(reserva.getCliente().getId())
                .build();
    }
}
