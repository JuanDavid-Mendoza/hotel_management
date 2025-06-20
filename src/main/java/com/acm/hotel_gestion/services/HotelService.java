package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.HotelModel;
import com.acm.hotel_gestion.persistence.entities.HotelEntity;
import com.acm.hotel_gestion.persistence.repository.HotelRepository;
import com.acm.hotel_gestion.util.HotelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelRepository hotelRepository;

    public HotelModel saveHotel(HotelModel hotel) {
        HotelEntity hotelEntity = hotelRepository.save(HotelMapper.modelToEntity(hotel));
        return HotelMapper.entityToModel(hotelEntity);
    }

    public void deleteById(Long id) {
        hotelRepository.deleteById(id);
    }

    public HotelModel findById(Long id) {
        HotelEntity hotelEntity = hotelRepository.findById(id).orElse(null);
        return hotelEntity != null ? HotelMapper.entityToModel(hotelEntity) : null;
    }

    public HotelModel updateHotel(HotelModel hotel) {
        HotelEntity hotelEntity =  hotelRepository.save(HotelMapper.modelToEntity(hotel));
        return HotelMapper.entityToModel(hotelEntity);
    }

    public List<HotelModel> findAll() {
        return hotelRepository.findAll().stream().map(HotelMapper::entityToModel).collect(Collectors.toList());
    }
}
