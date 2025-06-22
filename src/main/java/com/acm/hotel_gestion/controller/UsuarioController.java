package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.UsuarioDto;
import com.acm.hotel_gestion.models.UsuarioModel;
import com.acm.hotel_gestion.services.UsuarioService;
import com.acm.hotel_gestion.util.UsuarioMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
@Validated
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioModel> saveUsuario(@Valid @RequestBody UsuarioDto usuario) {
        return ResponseEntity.ok(usuarioService.saveUsuario(UsuarioMapper.dtoToModel(usuario)));
    }

    @PutMapping
    public ResponseEntity<UsuarioModel> updateUsuario(@Valid @RequestBody UsuarioDto usuario) {
        return ResponseEntity.ok(usuarioService.updateUsuario(UsuarioMapper.dtoToModel(usuario)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioModel> getUsuarioById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioModel>> getAllUsuarios() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long id) {
        usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
