package com.acm.hotel_gestion.persistence.entities;

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
@Table(name="empleado")
public class EmpleadoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empleado")
    private Long id;
    private String correo;
    private String telefono;
    @Column(name="primer_nombre")
    private String primerNombre;
    @Column(name ="segundo_nombre")
    private String segundoNombre;
    @Column(name ="primer_apellido")
    private String primerApellido;
    @Column(name ="segundo_apellido")
    private String segundoApellido;

    @OneToMany(mappedBy = "empleado")
    @JsonManagedReference("empleado-usuarios")
    private List<UsuarioEntity> usuarios = new ArrayList<>();
}
