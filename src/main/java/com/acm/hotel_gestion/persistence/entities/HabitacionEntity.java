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
@Table(name="habitacion")
public class HabitacionEntity implements Serializable {
    @Id
    @Column(name="id_habitacion")
    private Long id;
    @Column(name="numero_habitacion")
    private Integer numeroHabitacion;
    @Column(name="precio_dia")
    private Integer precioDia;
    private Boolean disponible;

    @ManyToOne
    @JoinColumn(name="fk_id_hotel")
    private HotelEntity hotel;

    @ManyToOne
    @JoinColumn(name="fk_id_tipo_habitacion")
    private TipoHabitacionEntity tipoHabitacion;
}
