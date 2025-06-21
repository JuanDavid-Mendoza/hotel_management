package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.EmpleadoModel;
import com.acm.hotel_gestion.persistence.entities.EmpleadoEntity;
import com.acm.hotel_gestion.persistence.repository.EmpleadoRepository;
import com.acm.hotel_gestion.util.EmpleadoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoModel saveEmpleado(EmpleadoModel empleado) {
        EmpleadoEntity empleadoEntity = empleadoRepository.save(EmpleadoMapper.modelToEntity(empleado));
        return EmpleadoMapper.entityToModel(empleadoEntity);
    }

    public void deleteById(Long id) {
        empleadoRepository.deleteById(id);
    }

    public EmpleadoModel findById(Long id) {
        EmpleadoEntity empleadoEntity = empleadoRepository.findById(id).orElse(null);
        return empleadoEntity != null ? EmpleadoMapper.entityToModel(empleadoEntity) : null;
    }

    public EmpleadoModel updateEmpleado(EmpleadoModel empleado) {
        EmpleadoEntity empleadoEntity =  empleadoRepository.save(EmpleadoMapper.modelToEntity(empleado));
        return EmpleadoMapper.entityToModel(empleadoEntity);
    }

    public List<EmpleadoModel> findAll() {
        return empleadoRepository.findAll().stream().map(EmpleadoMapper::entityToModel).collect(Collectors.toList());
    }
}
