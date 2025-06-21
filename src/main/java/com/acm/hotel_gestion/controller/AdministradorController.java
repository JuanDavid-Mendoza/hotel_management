package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.AdministradorDto;
import com.acm.hotel_gestion.models.AdministradorModel;
import com.acm.hotel_gestion.services.AdministradorService;
import com.acm.hotel_gestion.util.AdministradorMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrador")
@RequiredArgsConstructor
@Validated
public class AdministradorController {
    private final AdministradorService administradorService;

    @PostMapping
    public ResponseEntity<AdministradorModel> saveAdministrador(@Valid @RequestBody AdministradorDto administrador) {
        return ResponseEntity.ok(administradorService.saveAdministrador(AdministradorMapper.dtoToModel(administrador)));
    }

    @PutMapping
    public ResponseEntity<AdministradorModel> updateAdministrador(@Valid @RequestBody AdministradorDto administrador) {
        return ResponseEntity.ok(administradorService.updateAdministrador(AdministradorMapper.dtoToModel(administrador)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdministradorModel> getAdministradorById(@PathVariable Long id) {
        return ResponseEntity.ok(administradorService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<AdministradorModel>> getAllAdministradors() {
        return ResponseEntity.ok(administradorService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdministradorById(@PathVariable Long id) {
        administradorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
