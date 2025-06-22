package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.UsuarioDto;
import com.acm.hotel_gestion.models.*;
import com.acm.hotel_gestion.persistence.entities.*;

public class UsuarioMapper {
    public static UsuarioDto modelToDto(UsuarioModel usuario){
        return UsuarioDto.builder()
                .id(usuario.getId())
                .nombreUsuario(usuario.getNombreUsuario())
                .contrasena(usuario.getContrasena())
                .rol(usuario.getRol())
                .idcliente(ClienteModel.builder().id(usuario.getClienteID()).build().getId())
                .idempleado(EmpleadoModel.builder().id(usuario.getEmpleadoID()).build().getId())
                .idadministradorGeneral(AdministradorGeneralModel.builder().id(usuario.getAdministradorGeneralID()).build().getId())
                .idadministrador(AdministradorModel.builder().id(usuario.getAdministradorID()).build().getId())
                .build();
    }
    public static UsuarioModel dtoToModel(UsuarioDto usuario){
        return UsuarioModel.builder()
                .id(usuario.getId())
                .nombreUsuario(usuario.getNombreUsuario())
                .contrasena(usuario.getContrasena())
                .rol(usuario.getRol())
                .clienteID(usuario.getIdcliente())
                .empleadoID(usuario.getIdempleado())
                .administradorGeneralID(usuario.getIdadministradorGeneral())
                .administradorID(usuario.getIdadministrador())
                .build();
    }
    public static UsuarioEntity modelToEntity(UsuarioModel usuario){
        return UsuarioEntity.builder()
                .id(usuario.getId())
                .nombreUsuario(usuario.getNombreUsuario())
                .contrasena(usuario.getContrasena())
                .rol(usuario.getRol())
                .cliente(usuario.getClienteID() != null ? ClienteEntity.builder().id(usuario.getClienteID()).build():null)
                .empleado(usuario.getEmpleadoID() != null ? EmpleadoEntity.builder().id(usuario.getEmpleadoID()).build():null)
                .administradorGeneral(usuario.getAdministradorGeneralID() != null ? AdministradorGeneralEntity.builder().id(usuario.getAdministradorGeneralID()).build():null)
                .administrador(usuario.getAdministradorID() != null ? AdministradorEntity.builder().id(usuario.getAdministradorID()).build():null)
                .build();
    }
    public static UsuarioModel entityToModel(UsuarioEntity usuario){
        return UsuarioModel.builder()
                .id(usuario.getId())
                .nombreUsuario(usuario.getNombreUsuario())
                .contrasena(usuario.getContrasena())
                .rol(usuario.getRol())
                .clienteID(usuario.getCliente() != null ? usuario.getCliente().getId():null)
                .empleadoID(usuario.getEmpleado() != null ? usuario.getEmpleado().getId():null)
                .administradorGeneralID(usuario.getAdministradorGeneral() != null ? usuario.getAdministradorGeneral().getId():null)
                .administradorID(usuario.getAdministrador() != null ? usuario.getAdministrador().getId():null)
                .build();
    }
}
