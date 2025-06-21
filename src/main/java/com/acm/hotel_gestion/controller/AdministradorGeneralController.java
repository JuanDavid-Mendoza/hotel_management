package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.AdministradorGeneralDto;
import com.acm.hotel_gestion.models.AdministradorGeneralModel;
import com.acm.hotel_gestion.services.AdministradorGeneralService;
import com.acm.hotel_gestion.util.AdministradorGeneralMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administradorGeneral")
@RequiredArgsConstructor
@Validated
public class AdministradorGeneralController {
    private final AdministradorGeneralService administradorGeneralService;

    @PostMapping
    public ResponseEntity<AdministradorGeneralModel> saveAdministradorGeneral(@Valid @RequestBody AdministradorGeneralDto administradorGeneral) {
        return ResponseEntity.ok(administradorGeneralService.saveAdministradorGeneral(AdministradorGeneralMapper.dtoToModel(administradorGeneral)));
    }

    @PutMapping
    public ResponseEntity<AdministradorGeneralModel> updateAdministradorGeneral(@Valid @RequestBody AdministradorGeneralDto administradorGeneral) {
        return ResponseEntity.ok(administradorGeneralService.updateAdministradorGeneral(AdministradorGeneralMapper.dtoToModel(administradorGeneral)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdministradorGeneralModel> getAdministradorGeneralById(@PathVariable Long id) {
        return ResponseEntity.ok(administradorGeneralService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<AdministradorGeneralModel>> getAllAdministradorGenerals() {
        return ResponseEntity.ok(administradorGeneralService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdministradorGeneralById(@PathVariable Long id) {
        administradorGeneralService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
