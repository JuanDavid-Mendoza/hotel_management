package com.acm.hotel_gestion.models;

import com.acm.hotel_gestion.persistence.entities.ClienteEntity;
import com.acm.hotel_gestion.persistence.entities.HabitacionEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservaModel {
    private Long id;
    private Timestamp fechaInicio;
    private Timestamp fechaFinal;
    private Integer cantidadDias;
    private Boolean estado;
    private Timestamp fechaReserva;
    private HabitacionEntity habitacion;
    private ClienteEntity cliente;
}
