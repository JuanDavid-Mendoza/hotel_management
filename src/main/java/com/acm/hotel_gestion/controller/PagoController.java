package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.PagoDto;
import com.acm.hotel_gestion.models.PagoModel;
import com.acm.hotel_gestion.services.PagoService;
import com.acm.hotel_gestion.util.PagoMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pago")
@RequiredArgsConstructor
@Validated
public class PagoController {
    private final PagoService pagoService;

    @PostMapping
    public ResponseEntity<PagoModel> savePago(@Valid @RequestBody PagoDto pago) {
        return ResponseEntity.ok(pagoService.savePago(PagoMapper.dtoToModel(pago)));
    }

    @PutMapping
    public ResponseEntity<PagoModel> updatePago(@Valid @RequestBody PagoDto pago) {
        return ResponseEntity.ok(pagoService.updatePago(PagoMapper.dtoToModel(pago)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PagoModel> getPagoById(@PathVariable Long id) {
        return ResponseEntity.ok(pagoService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<PagoModel>> getAllPagos() {
        return ResponseEntity.ok(pagoService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePagoById(@PathVariable Long id) {
        pagoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
