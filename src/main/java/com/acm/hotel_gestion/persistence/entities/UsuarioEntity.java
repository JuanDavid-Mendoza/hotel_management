package com.acm.hotel_gestion.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name="usuario")
public class UsuarioEntity implements Serializable {
    @Id
    @Column(name = "id_usuario")
    private Long id;
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    private String contrasena;
    private String rol;

    @ManyToOne
    @JoinColumn(name = "fk_id_cliente")
    @JsonBackReference("cliente-usuarios")
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "fk_id_empleado")
    @JsonBackReference("empleado-usuarios")
    private EmpleadoEntity empleado;

    @ManyToOne
    @JoinColumn(name = "fk_id_administrador_general")
    @JsonBackReference("administradorGeneral-usuarios")
    private AdministradorGeneralEntity administradorGeneral;

    @ManyToOne
    @JoinColumn(name = "fk_id_administrador")
    @JsonBackReference("administrador-usuarios")
    private AdministradorEntity administrador;
}
