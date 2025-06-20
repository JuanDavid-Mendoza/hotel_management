package com.acm.hotel_gestion.controller;

import com.acm.hotel_gestion.controller.dto.HotelDto;
import com.acm.hotel_gestion.models.HotelModel;
import com.acm.hotel_gestion.services.HotelService;
import com.acm.hotel_gestion.util.HotelMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
@Validated
public class HotelController {
    private final HotelService hotelService;

    @PostMapping
    public ResponseEntity<HotelModel> saveHotel(@Valid @RequestBody HotelDto hotel) {
        return ResponseEntity.ok(hotelService.saveHotel(HotelMapper.dtoToModel(hotel)));
    }

    @PutMapping
    public ResponseEntity<HotelModel> updateHotel(@Valid @RequestBody HotelDto hotel) {
        return ResponseEntity.ok(hotelService.updateHotel(HotelMapper.dtoToModel(hotel)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelModel> getHotelById(@PathVariable Long id) {
        return ResponseEntity.ok(hotelService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<HotelModel>> getAllHotels() {
        return ResponseEntity.ok(hotelService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotelById(@PathVariable Long id) {
        hotelService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
