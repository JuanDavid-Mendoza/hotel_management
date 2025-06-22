package com.acm.hotel_gestion.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioModel {
    private Long id;
    private String nombreUsuario;
    private String contrasena;
    private String rol;
    private Long clienteID;
    private Long empleadoID;
    private Long administradorGeneralID;
    private Long administradorID;
}
