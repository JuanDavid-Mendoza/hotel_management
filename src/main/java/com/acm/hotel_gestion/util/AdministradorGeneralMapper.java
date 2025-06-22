package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.AdministradorGeneralDto;
import com.acm.hotel_gestion.models.AdministradorGeneralModel;
import com.acm.hotel_gestion.persistence.entities.AdministradorGeneralEntity;

public class AdministradorGeneralMapper {
    public static AdministradorGeneralDto modelToDto(AdministradorGeneralModel administradorGeneral) {
        return AdministradorGeneralDto.builder()
                .id(administradorGeneral.getId())
                .correo(administradorGeneral.getCorreo())
                .telefono(administradorGeneral.getTelefono())
                .primerNombre(administradorGeneral.getPrimerNombre())
                .segundoNombre(administradorGeneral.getSegundoNombre())
                .primerApellido(administradorGeneral.getPrimerApellido())
                .segundoApellido(administradorGeneral.getSegundoApellido())
                .build();
    }
    public static AdministradorGeneralModel dtoToModel(AdministradorGeneralDto administradorGeneral) {
        return  AdministradorGeneralModel.builder()
                .id(administradorGeneral.getId())
                .correo(administradorGeneral.getCorreo())
                .telefono(administradorGeneral.getTelefono())
                .primerNombre(administradorGeneral.getPrimerNombre())
                .segundoNombre(administradorGeneral.getSegundoNombre())
                .primerApellido(administradorGeneral.getPrimerApellido())
                .segundoApellido(administradorGeneral.getSegundoApellido())
                .build();
    }
    public static AdministradorGeneralEntity modelToEntity(AdministradorGeneralModel administradorGeneral) {
        return AdministradorGeneralEntity.builder()
                .id(administradorGeneral.getId())
                .correo(administradorGeneral.getCorreo())
                .telefono(administradorGeneral.getTelefono())
                .primerNombre(administradorGeneral.getPrimerNombre())
                .segundoNombre(administradorGeneral.getSegundoNombre())
                .primerApellido(administradorGeneral.getPrimerApellido())
                .segundoApellido(administradorGeneral.getSegundoApellido())
                .build();
    }
    public static AdministradorGeneralModel entityToModel(AdministradorGeneralEntity administradorGeneral) {
        return AdministradorGeneralModel.builder()
                .id(administradorGeneral.getId())
                .correo(administradorGeneral.getCorreo())
                .telefono(administradorGeneral.getTelefono())
                .primerNombre(administradorGeneral.getPrimerNombre())
                .segundoNombre(administradorGeneral.getSegundoNombre())
                .primerApellido(administradorGeneral.getPrimerApellido())
                .segundoApellido(administradorGeneral.getSegundoApellido())
                .build();
    }
}
