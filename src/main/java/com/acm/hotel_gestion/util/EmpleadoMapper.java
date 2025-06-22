package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.EmpleadoDto;
import com.acm.hotel_gestion.models.EmpleadoModel;
import com.acm.hotel_gestion.persistence.entities.EmpleadoEntity;

public class EmpleadoMapper {
    public static EmpleadoDto modelToDto(EmpleadoModel empleado) {
        return EmpleadoDto.builder()
                .id(empleado.getId())
                .correo(empleado.getCorreo())
                .telefono(empleado.getTelefono())
                .primerNombre(empleado.getPrimerNombre())
                .segundoNombre(empleado.getSegundoNombre())
                .primerApellido(empleado.getPrimerApellido())
                .segundoApellido(empleado.getSegundoApellido())
                .build();
    }
    public static EmpleadoModel dtoToModel(EmpleadoDto empleado) {
        return  EmpleadoModel.builder()
                .id(empleado.getId())
                .correo(empleado.getCorreo())
                .telefono(empleado.getTelefono())
                .primerNombre(empleado.getPrimerNombre())
                .segundoNombre(empleado.getSegundoNombre())
                .primerApellido(empleado.getPrimerApellido())
                .segundoApellido(empleado.getSegundoApellido())
                .build();
    }
    public static EmpleadoEntity modelToEntity(EmpleadoModel empleado) {
        return EmpleadoEntity.builder()
                .id(empleado.getId())
                .correo(empleado.getCorreo())
                .telefono(empleado.getTelefono())
                .primerNombre(empleado.getPrimerNombre())
                .segundoNombre(empleado.getSegundoNombre())
                .primerApellido(empleado.getPrimerApellido())
                .segundoApellido(empleado.getSegundoApellido())
                .build();
    }
    public static EmpleadoModel entityToModel(EmpleadoEntity empleado) {
        return EmpleadoModel.builder()
                .id(empleado.getId())
                .correo(empleado.getCorreo())
                .telefono(empleado.getTelefono())
                .primerNombre(empleado.getPrimerNombre())
                .segundoNombre(empleado.getSegundoNombre())
                .primerApellido(empleado.getPrimerApellido())
                .segundoApellido(empleado.getSegundoApellido())
                .build();
    }
}
