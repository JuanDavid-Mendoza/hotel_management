package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.TipoHabitacionDto;
import com.acm.hotel_gestion.models.TipoHabitacionModel;
import com.acm.hotel_gestion.services.TipoHabitacionService;
import com.acm.hotel_gestion.util.TipoHabitacionMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoHabitacion")
@RequiredArgsConstructor
@Validated
public class TipoHabitacionController {
    private final TipoHabitacionService tipoHabitacionService;

    @PostMapping
    public ResponseEntity<TipoHabitacionModel> saveTipoHabitacion(@Valid @RequestBody TipoHabitacionDto tipoHabitacion) {
        return ResponseEntity.ok(tipoHabitacionService.saveTipoHabitacion(TipoHabitacionMapper.dtoToModel(tipoHabitacion)));
    }

    @PutMapping
    public ResponseEntity<TipoHabitacionModel> updateTipoHabitacion(@Valid @RequestBody TipoHabitacionDto tipoHabitacion) {
        return ResponseEntity.ok(tipoHabitacionService.updateTipoHabitacion(TipoHabitacionMapper.dtoToModel(tipoHabitacion)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoHabitacionModel> getTipoHabitacionById(@PathVariable Long id) {
        return ResponseEntity.ok(tipoHabitacionService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<TipoHabitacionModel>> getAllTipoHabitacions() {
        return ResponseEntity.ok(tipoHabitacionService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoHabitacionById(@PathVariable Long id) {
        tipoHabitacionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
