package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.UserAuthDto;
import com.acm.hotel_gestion.controller.dto.UsuarioDto;
import com.acm.hotel_gestion.models.UsuarioModel;
import com.acm.hotel_gestion.services.UsuarioService;
import com.acm.hotel_gestion.util.JwtUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@Validated
public class AuthController {
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;
    private final UsuarioService usuarioService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody UserAuthDto userAuthDto) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(userAuthDto.getNombreUsuario(), userAuthDto.getContrasena())
            );
            User user = (User) authentication.getPrincipal();
            String token = jwtUtil.generateToken(user.getUsername());
            Map<String, Object> response = new HashMap<>();
            response.put("token", token);
            response.put("username", user.getUsername());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid username or password");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@Valid @RequestBody UsuarioDto usuarioDto) {
        try {
            usuarioService.saveUsuario(UsuarioModel.builder()
                            .nombreUsuario(usuarioDto.getNombreUsuario())
                            .contrasena(passwordEncoder.encode(usuarioDto.getContrasena()))
                            .rol("Cliente")
                            .build());
            return ResponseEntity.ok("Usuario registrado con éxito");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
