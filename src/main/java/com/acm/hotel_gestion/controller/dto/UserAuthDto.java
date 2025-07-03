package com.acm.hotel_gestion.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAuthDto {
    private String nombreUsuario;
    private String contrasena;
}
