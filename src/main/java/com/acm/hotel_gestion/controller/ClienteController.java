package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.ClienteDto;
import com.acm.hotel_gestion.models.ClienteModel;
import com.acm.hotel_gestion.services.ClienteService;
import com.acm.hotel_gestion.util.ClienteMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
@Validated
public class ClienteController {
    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteModel> saveCliente(@Valid @RequestBody ClienteDto cliente) {
        return ResponseEntity.ok(clienteService.saveCliente(ClienteMapper.dtoToModel(cliente)));
    }

    @PutMapping
    public ResponseEntity<ClienteModel> updateCliente(@Valid @RequestBody ClienteDto cliente) {
        return ResponseEntity.ok(clienteService.updateCliente(ClienteMapper.dtoToModel(cliente)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> getClienteById(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<ClienteModel>> getAllClientes() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClienteById(@PathVariable Long id) {
        clienteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
