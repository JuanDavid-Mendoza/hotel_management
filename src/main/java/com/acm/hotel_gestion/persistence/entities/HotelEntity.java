package com.acm.hotel_gestion.persistence.entities;

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
@Table(name="hotel")
public class HotelEntity implements Serializable {
    @Id
    @Column(name="id_hotel")
    private Long id;
    private String nombre;
    private String ciudad;
    private String telefono;
    private String correo;
    private String direccion;

    @OneToMany(mappedBy = "hotel")
    private List<HabitacionEntity> habitaciones = new ArrayList<>();

    @OneToMany(mappedBy = "hotel")
    private List<TipoHabitacionEntity> tipoHabitaciones = new ArrayList<>();
}
