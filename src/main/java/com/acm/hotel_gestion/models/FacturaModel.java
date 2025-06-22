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
public class FacturaModel {
    private Long id;
    private Long reservaID;
    private Long pagoID;
    private Integer valorTotal;
    private Timestamp fechaEmision;
}
