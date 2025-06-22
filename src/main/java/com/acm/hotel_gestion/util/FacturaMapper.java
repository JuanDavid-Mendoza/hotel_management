package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.FacturaDto;
import com.acm.hotel_gestion.models.FacturaModel;
import com.acm.hotel_gestion.models.PagoModel;
import com.acm.hotel_gestion.models.ReservaModel;
import com.acm.hotel_gestion.persistence.entities.FacturaEntity;
import com.acm.hotel_gestion.persistence.entities.PagoEntity;
import com.acm.hotel_gestion.persistence.entities.ReservaEntity;

public class FacturaMapper {
    public static FacturaDto modelToDto(FacturaModel factura){
        return FacturaDto.builder()
                .id(factura.getId())
                .idreserva(ReservaModel.builder().id(factura.getReservaID()).build().getId())
                .idpago(PagoModel.builder().id(factura.getPagoID()).build().getId())
                .valorTotal(factura.getValorTotal())
                .fechaEmision(factura.getFechaEmision())
                .build();
    }
    public static FacturaModel dtoToModel(FacturaDto factura){
        return FacturaModel.builder()
                .id(factura.getId())
                .reservaID(factura.getIdreserva())
                .pagoID(factura.getIdpago())
                .valorTotal(factura.getValorTotal())
                .fechaEmision(factura.getFechaEmision())
                .build();
    }
    public static FacturaEntity modelToEntity(FacturaModel factura){
        return FacturaEntity.builder()
                .id(factura.getId())
                .reserva(ReservaEntity.builder().id(factura.getReservaID()).build())
                .pago(PagoEntity.builder().id(factura.getPagoID()).build())
                .valorTotal(factura.getValorTotal())
                .fechaEmision(factura.getFechaEmision())
                .build();
    }
    public static FacturaModel entityToModel(FacturaEntity factura){
        return FacturaModel.builder()
                .id(factura.getId())
                .pagoID(factura.getPago().getId())
                .reservaID(factura.getReserva().getId())
                .valorTotal(factura.getValorTotal())
                .fechaEmision(factura.getFechaEmision())
                .build();
    }
}
