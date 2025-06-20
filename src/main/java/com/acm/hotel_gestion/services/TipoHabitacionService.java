package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.TipoHabitacionModel;
import com.acm.hotel_gestion.persistence.entities.TipoHabitacionEntity;
import com.acm.hotel_gestion.persistence.repository.TipoHabitacionRepository;
import com.acm.hotel_gestion.util.TipoHabitacionMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class TipoHabitacionService {
    private final TipoHabitacionRepository tipoHabitacionRepository;

    public TipoHabitacionModel saveTipoHabitacion(TipoHabitacionModel tipoHabitacion) {
        TipoHabitacionEntity tipoHabitacionEntity = tipoHabitacionRepository.save(TipoHabitacionMapper.modelToEntity(tipoHabitacion));
        return TipoHabitacionMapper.entityToModel(tipoHabitacionEntity);
    }

    public void deleteById(Long id) {
        tipoHabitacionRepository.deleteById(id);
    }

    public TipoHabitacionModel findById(Long id) {
        TipoHabitacionEntity tipoHabitacionEntity = tipoHabitacionRepository.findById(id).orElse(null);
        return tipoHabitacionEntity != null ? TipoHabitacionMapper.entityToModel(tipoHabitacionEntity) : null;
    }

    public TipoHabitacionModel updateTipoHabitacion(TipoHabitacionModel tipoHabitacion) {
        TipoHabitacionEntity tipoHabitacionEntity =  tipoHabitacionRepository.save(TipoHabitacionMapper.modelToEntity(tipoHabitacion));
        return TipoHabitacionMapper.entityToModel(tipoHabitacionEntity);
    }

    public List<TipoHabitacionModel> findAll() {
        return tipoHabitacionRepository.findAll().stream().map(TipoHabitacionMapper::entityToModel).collect(Collectors.toList());
    }
}
