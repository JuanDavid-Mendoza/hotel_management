package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.AdministradorModel;
import com.acm.hotel_gestion.persistence.entities.AdministradorEntity;
import com.acm.hotel_gestion.persistence.repository.AdministradorRepository;
import com.acm.hotel_gestion.util.AdministradorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdministradorService {
    private final AdministradorRepository administradorRepository;

    public AdministradorModel saveAdministrador(AdministradorModel administrador) {
        AdministradorEntity administradorEntity = administradorRepository.save(AdministradorMapper.modelToEntity(administrador));
        return AdministradorMapper.entityToModel(administradorEntity);
    }

    public void deleteById(Long id) {
        administradorRepository.deleteById(id);
    }

    public AdministradorModel findById(Long id) {
        AdministradorEntity administradorEntity = administradorRepository.findById(id).orElse(null);
        return administradorEntity != null ? AdministradorMapper.entityToModel(administradorEntity) : null;
    }

    public AdministradorModel updateAdministrador(AdministradorModel administrador) {
        AdministradorEntity administradorEntity =  administradorRepository.save(AdministradorMapper.modelToEntity(administrador));
        return AdministradorMapper.entityToModel(administradorEntity);
    }

    public List<AdministradorModel> findAll() {
        return administradorRepository.findAll().stream().map(AdministradorMapper::entityToModel).collect(Collectors.toList());
    }
}
