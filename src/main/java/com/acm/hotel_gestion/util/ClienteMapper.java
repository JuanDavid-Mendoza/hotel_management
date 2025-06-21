package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.ClienteDto;
import com.acm.hotel_gestion.models.ClienteModel;
import com.acm.hotel_gestion.persistence.entities.ClienteEntity;

public class ClienteMapper {
    public static ClienteDto modelToDTO(ClienteModel cliente) {
        return ClienteDto.builder()
                .id(cliente.getId())
                .primerNombre(cliente.getPrimerNombre())
                .segundoNombre(cliente.getSegundoNombre())
                .primerApellido(cliente.getPrimerApellido())
                .segundoApellido(cliente.getSegundoApellido())
                .cedula(cliente.getCedula())
                .direccion(cliente.getDireccion())
                .build();
    }
    public static ClienteModel dtoToModel(ClienteDto cliente) {
        return  ClienteModel.builder()
                .id(cliente.getId())
                .primerNombre(cliente.getPrimerNombre())
                .segundoNombre(cliente.getSegundoNombre())
                .primerApellido(cliente.getPrimerApellido())
                .segundoApellido(cliente.getSegundoApellido())
                .cedula(cliente.getCedula())
                .direccion(cliente.getDireccion())
                .build();
    }
    public static ClienteEntity modelToEntity(ClienteModel cliente) {
        return ClienteEntity.builder()
                .id(cliente.getId())
                .primerNombre(cliente.getPrimerNombre())
                .segundoNombre(cliente.getSegundoNombre())
                .primerApellido(cliente.getPrimerApellido())
                .segundoApellido(cliente.getSegundoApellido())
                .cedula(cliente.getCedula())
                .direccion(cliente.getDireccion())
                .build();
    }
    public static ClienteModel entityToModel(ClienteEntity cliente) {
        return ClienteModel.builder()
                .id(cliente.getId())
                .primerNombre(cliente.getPrimerNombre())
                .segundoNombre(cliente.getSegundoNombre())
                .primerApellido(cliente.getPrimerApellido())
                .segundoApellido(cliente.getSegundoApellido())
                .cedula(cliente.getCedula())
                .direccion(cliente.getDireccion())
                .build();
    }
}
