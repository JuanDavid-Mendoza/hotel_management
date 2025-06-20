package com.acm.hotel_gestion.util;

import com.acm.hotel_gestion.controller.dto.HotelDto;
import com.acm.hotel_gestion.models.HotelModel;
import com.acm.hotel_gestion.persistence.entities.HotelEntity;

public class HotelMapper {
    public static HotelDto modelToDto(HotelModel product) {
        return HotelDto.builder()
                .id(product.getId())
                .nombre(product.getNombre())
                .ciudad(product.getCiudad())
                .telefono(product.getTelefono())
                .correo(product.getCorreo())
                .direccion(product.getDireccion())
                .build();
    }

    public static HotelModel dtoToModel(HotelDto product) {
        return HotelModel.builder()
                .id(product.getId())
                .nombre(product.getNombre())
                .ciudad(product.getCiudad())
                .telefono(product.getTelefono())
                .correo(product.getCorreo())
                .direccion(product.getDireccion())
                .build();
    }

    public static HotelEntity modelToEntity(HotelModel product) {
        return HotelEntity.builder()
                .id(product.getId())
                .nombre(product.getNombre())
                .ciudad(product.getCiudad())
                .telefono(product.getTelefono())
                .correo(product.getCorreo())
                .direccion(product.getDireccion())
                .build();
    }

    public static HotelModel entityToModel(HotelEntity product) {
        return HotelModel.builder()
                .id(product.getId())
                .nombre(product.getNombre())
                .ciudad(product.getCiudad())
                .telefono(product.getTelefono())
                .correo(product.getCorreo())
                .direccion(product.getDireccion())
                .build();
    }
}
