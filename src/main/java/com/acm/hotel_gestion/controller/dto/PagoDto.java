package com.acm.hotel_gestion.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class PagoDto {
    @Min(value = 1, message = "El id deber ser mayor que 0")
    private Long id;

    @NotNull
    private Timestamp fecha;

    private Long idreserva;

    @Size(min = 1, max = 20, message = "El metodo de pago debe tener de 1 a 20 caracteres")
    private String metodoPago;

    @Min(value = 1, message = "El pagoTotal debe ser mayor a 0")
    private Integer pagoTotal;
}
