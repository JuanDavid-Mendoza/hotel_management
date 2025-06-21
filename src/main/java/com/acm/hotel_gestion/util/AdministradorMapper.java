package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.AdministradorDto;
import com.acm.hotel_gestion.models.AdministradorModel;
import com.acm.hotel_gestion.persistence.entities.AdministradorEntity;

public class AdministradorMapper {
    public static AdministradorDto modelToDTO(AdministradorModel administrador) {
        return AdministradorDto.builder()
                .id(administrador.getId())
                .primerNombre(administrador.getPrimerNombre())
                .segundoNombre(administrador.getSegundoNombre())
                .primerApellido(administrador.getPrimerApellido())
                .segundoApellido(administrador.getSegundoApellido())
                .correo(administrador.getCorreo())
                .telefono(administrador.getTelefono())
                .build();
    }
    public static AdministradorModel dtoToModel(AdministradorDto administrador) {
        return  AdministradorModel.builder()
                .id(administrador.getId())
                .primerNombre(administrador.getPrimerNombre())
                .segundoNombre(administrador.getSegundoNombre())
                .primerApellido(administrador.getPrimerApellido())
                .segundoApellido(administrador.getSegundoApellido())
                .correo(administrador.getCorreo())
                .telefono(administrador.getTelefono())
                .build();
    }
    public static AdministradorEntity modelToEntity(AdministradorModel administrador) {
        return AdministradorEntity.builder()
                .id(administrador.getId())
                .primerNombre(administrador.getPrimerNombre())
                .segundoNombre(administrador.getSegundoNombre())
                .primerApellido(administrador.getPrimerApellido())
                .segundoApellido(administrador.getSegundoApellido())
                .correo(administrador.getCorreo())
                .telefono(administrador.getTelefono())
                .build();
    }
    public static AdministradorModel entityToModel(AdministradorEntity administrador) {
        return AdministradorModel.builder()
                .id(administrador.getId())
                .primerNombre(administrador.getPrimerNombre())
                .segundoNombre(administrador.getSegundoNombre())
                .primerApellido(administrador.getPrimerApellido())
                .segundoApellido(administrador.getSegundoApellido())
                .correo(administrador.getCorreo())
                .telefono(administrador.getTelefono())
                .build();
    }
}
