package com.acm.hotel_gestion.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagoModel {
    private Long id;
    private Timestamp fecha;
    private Long reservaID;
    private String metodoPago;
    private Integer pagoTotal;
}
