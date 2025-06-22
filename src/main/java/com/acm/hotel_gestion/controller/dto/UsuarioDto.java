package com.acm.hotel_gestion.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDto {
    @Min(value = 1, message = "El valor del id debe ser mayor a 0")
    private Long id;

    @Size(min = 1, max = 255, message = "El  nombre de usuario debe tener de 1 a 255 caracteres")
    private String nombreUsuario;

    @Size(min = 1, max = 255, message = "La constraseña debe tener de 1 a 255 caracteres")
    private String contrasena;

    @Size(min = 1,max = 30, message = "El rol debe tener de 1 a 30 caracteres")
    private String rol;

    private Long idcliente;

    private Long idempleado;

    private Long idadministradorGeneral;

    private Long idadministrador;
}
