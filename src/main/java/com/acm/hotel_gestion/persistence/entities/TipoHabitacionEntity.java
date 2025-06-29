package com.acm.hotel_gestion.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="tipo_habitacion")
public class TipoHabitacionEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo_habitacion")
    private Long id;
    private String nombre;
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name="fk_id_hotel")
    @JsonBackReference("hotel-tipoHabitaciones")
    private HotelEntity hotel;

    @OneToMany(mappedBy = "tipoHabitacion")
    @JsonManagedReference("tipoHabitacion-habitaciones")
    private List<HabitacionEntity> habitaciones = new ArrayList<>();
}
