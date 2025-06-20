package com.acm.hotel_gestion.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="tipo_habitacion")
public class TipoHabitacionEntity implements Serializable {
    @Id
    @Column(name="id_tipo_habitacion")
    private Long id;
    private String nombre;
    private Integer cantidad;
}
