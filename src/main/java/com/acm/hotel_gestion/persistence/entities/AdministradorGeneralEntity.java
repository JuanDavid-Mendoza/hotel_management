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
@Table(name="administrador_general")
public class AdministradorGeneralEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_administrador_general")
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

    @OneToMany(mappedBy = "administradorGeneral")
    @JsonManagedReference("administradorGeneral-usuarios")
    private List<UsuarioEntity> usuarios = new ArrayList<>();
}
