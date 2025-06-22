package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.FacturaDto;
import com.acm.hotel_gestion.models.FacturaModel;
import com.acm.hotel_gestion.services.FacturaService;
import com.acm.hotel_gestion.util.FacturaMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factura")
@RequiredArgsConstructor
@Validated
public class FacturaController {
    private final FacturaService facturaService;

    @PostMapping
    public ResponseEntity<FacturaModel> saveFactura(@Valid @RequestBody FacturaDto factura) {
        return ResponseEntity.ok(facturaService.saveFactura(FacturaMapper.dtoToModel(factura)));
    }

    @PutMapping
    public ResponseEntity<FacturaModel> updateFactura(@Valid @RequestBody FacturaDto factura) {
        return ResponseEntity.ok(facturaService.updateFactura(FacturaMapper.dtoToModel(factura)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FacturaModel> getFacturaById(@PathVariable Long id) {
        return ResponseEntity.ok(facturaService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<FacturaModel>> getAllFacturas() {
        return ResponseEntity.ok(facturaService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFacturaById(@PathVariable Long id) {
        facturaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
