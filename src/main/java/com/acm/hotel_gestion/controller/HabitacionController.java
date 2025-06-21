package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.HabitacionDto;
import com.acm.hotel_gestion.models.HabitacionModel;
import com.acm.hotel_gestion.services.HabitacionService;
import com.acm.hotel_gestion.util.HabitacionMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitacion")
@RequiredArgsConstructor
@Validated
public class HabitacionController {
    private final HabitacionService habitacionService;

    @PostMapping
    public ResponseEntity<HabitacionModel> saveHabitacion(@Valid @RequestBody HabitacionDto habitacion) {
        return ResponseEntity.ok(habitacionService.saveHabitacion(HabitacionMapper.dtoToModel(habitacion)));
    }

    @PutMapping
    public ResponseEntity<HabitacionModel> updateHabitacion(@Valid @RequestBody HabitacionDto habitacion) {
        return ResponseEntity.ok(habitacionService.updateHabitacion(HabitacionMapper.dtoToModel(habitacion)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HabitacionModel> getHabitacionById(@PathVariable Long id) {
        return ResponseEntity.ok(habitacionService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<HabitacionModel>> getAllHabitacions() {
        return ResponseEntity.ok(habitacionService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHabitacionById(@PathVariable Long id) {
        habitacionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
