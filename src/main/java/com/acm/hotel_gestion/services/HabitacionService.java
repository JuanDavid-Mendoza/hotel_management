package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.HabitacionModel;
import com.acm.hotel_gestion.persistence.entities.HabitacionEntity;
import com.acm.hotel_gestion.persistence.repository.HabitacionRepository;
import com.acm.hotel_gestion.util.HabitacionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HabitacionService {
    private final HabitacionRepository habitacionRepository;

    public HabitacionModel saveHabitacion(HabitacionModel habitacion) {
        HabitacionEntity habitacionEntity = habitacionRepository.save(HabitacionMapper.modelToEntity(habitacion));
        return HabitacionMapper.entityToModel(habitacionEntity);
    }

    public void deleteById(Long id) {
        habitacionRepository.deleteById(id);
    }

    public HabitacionModel findById(Long id) {
        HabitacionEntity habitacionEntity = habitacionRepository.findById(id).orElse(null);
        return habitacionEntity != null ? HabitacionMapper.entityToModel(habitacionEntity) : null;
    }

    public HabitacionModel updateHabitacion(HabitacionModel habitacion) {
        HabitacionEntity habitacionEntity =  habitacionRepository.save(HabitacionMapper.modelToEntity(habitacion));
        return HabitacionMapper.entityToModel(habitacionEntity);
    }

    public List<HabitacionModel> findAll() {
        return habitacionRepository.findAll().stream().map(HabitacionMapper::entityToModel).collect(Collectors.toList());
    }
}
