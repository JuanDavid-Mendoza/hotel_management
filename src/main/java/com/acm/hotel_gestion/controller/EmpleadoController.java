package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.EmpleadoDto;
import com.acm.hotel_gestion.models.EmpleadoModel;
import com.acm.hotel_gestion.services.EmpleadoService;
import com.acm.hotel_gestion.util.EmpleadoMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
@RequiredArgsConstructor
@Validated
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<EmpleadoModel> saveEmpleado(@Valid @RequestBody EmpleadoDto empleado) {
        return ResponseEntity.ok(empleadoService.saveEmpleado(EmpleadoMapper.dtoToModel(empleado)));
    }

    @PutMapping
    public ResponseEntity<EmpleadoModel> updateEmpleado(@Valid @RequestBody EmpleadoDto empleado) {
        return ResponseEntity.ok(empleadoService.updateEmpleado(EmpleadoMapper.dtoToModel(empleado)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoModel> getEmpleadoById(@PathVariable Long id) {
        return ResponseEntity.ok(empleadoService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<EmpleadoModel>> getAllEmpleados() {
        return ResponseEntity.ok(empleadoService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpleadoById(@PathVariable Long id) {
        empleadoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
