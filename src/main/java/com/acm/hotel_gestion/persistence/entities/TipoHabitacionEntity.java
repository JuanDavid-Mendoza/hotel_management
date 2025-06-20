package com.acm.hotel_gestion.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="tipo_habitacion")
public class TipoHabitacionEntity implements Serializable {
    @Id
    @Column(name="id_tipo_habitacion")
    private Long id;
    private String nombre;
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name="fk_id_hotel")
    private HotelEntity hotel;
}
