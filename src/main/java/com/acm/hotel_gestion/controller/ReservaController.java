package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.ReservaDto;
import com.acm.hotel_gestion.models.ReservaModel;
import com.acm.hotel_gestion.services.ReservaService;
import com.acm.hotel_gestion.util.ReservaMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
@RequiredArgsConstructor
@Validated
public class ReservaController {
    private final ReservaService reservaService;

    @PostMapping
    public ResponseEntity<ReservaModel> saveReserva(@Valid @RequestBody ReservaDto reserva) {
        return ResponseEntity.ok(reservaService.saveReserva(ReservaMapper.dtoToModel(reserva)));
    }

    @PutMapping
    public ResponseEntity<ReservaModel> updateReserva(@Valid @RequestBody ReservaDto reserva) {
        return ResponseEntity.ok(reservaService.updateReserva(ReservaMapper.dtoToModel(reserva)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservaModel> getReservaById(@PathVariable Long id) {
        return ResponseEntity.ok(reservaService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<ReservaModel>> getAllReservas() {
        return ResponseEntity.ok(reservaService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservaById(@PathVariable Long id) {
        reservaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
