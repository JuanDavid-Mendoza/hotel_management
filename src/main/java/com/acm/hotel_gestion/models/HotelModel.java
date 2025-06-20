package com.acm.hotel_gestion.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelModel {
    private Long id;
    private String nombre;
    private String ciudad;
    private String telefono;
    private String correo;
    private String direccion;
}
