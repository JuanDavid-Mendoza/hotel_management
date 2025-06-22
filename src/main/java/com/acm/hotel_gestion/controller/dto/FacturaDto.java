package com.acm.hotel_gestion.controller.dto;

import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class FacturaDto {
    @Min(value = 1, message = "El id debe ser mayor a 0")
    private Long id;

    private Long idreserva;

    private Long idpago;

    private Integer valorTotal;

    private Timestamp fechaEmision;
}
