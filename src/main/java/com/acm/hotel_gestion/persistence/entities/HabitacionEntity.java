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
    @JsonBackReference("hotel-habitaciones")
    private HotelEntity hotel;

    @ManyToOne
    @JoinColumn(name="fk_id_tipo_habitacion")
    @JsonBackReference("tipoHabitacion-habitaciones")
    private TipoHabitacionEntity tipoHabitacion;

    @OneToMany(mappedBy = "habitacion")
    @JsonManagedReference("habitacion-reservas")
    private List<ReservaEntity> reservas =  new ArrayList<>();
}
