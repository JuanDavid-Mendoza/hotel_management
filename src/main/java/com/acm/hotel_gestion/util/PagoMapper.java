package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.PagoDto;
import com.acm.hotel_gestion.models.PagoModel;
import com.acm.hotel_gestion.models.ReservaModel;
import com.acm.hotel_gestion.persistence.entities.PagoEntity;
import com.acm.hotel_gestion.persistence.entities.ReservaEntity;

public class PagoMapper {
    public static PagoDto modelToDto(PagoModel pago){
        return PagoDto.builder()
                .id(pago.getId())
                .fecha(pago.getFecha())
                .idreserva(ReservaModel.builder().id(pago.getReservaID()).build().getId())
                .metodoPago(pago.getMetodoPago())
                .pagoTotal(pago.getPagoTotal())
                .build();
    }
    public static PagoModel dtoToModel(PagoDto pago){
        return PagoModel.builder()
                .id(pago.getId())
                .fecha(pago.getFecha())
                .reservaID(pago.getIdreserva())
                .metodoPago(pago.getMetodoPago())
                .pagoTotal(pago.getPagoTotal())
                .build();
    }
    public static PagoEntity modelToEntity(PagoModel pago){
        return PagoEntity.builder()
                .id(pago.getId())
                .fecha(pago.getFecha())
                .reserva(ReservaEntity.builder().id(pago.getReservaID()).build())
                .metodoPago(pago.getMetodoPago())
                .pagoTotal(pago.getPagoTotal())
                .build();
    }
    public static PagoModel entityToModel(PagoEntity pago){
        return PagoModel.builder()
                .id(pago.getId())
                .fecha(pago.getFecha())
                .reservaID(pago.getReserva().getId())
                .metodoPago(pago.getMetodoPago())
                .pagoTotal(pago.getPagoTotal())
                .build();
    }
}
