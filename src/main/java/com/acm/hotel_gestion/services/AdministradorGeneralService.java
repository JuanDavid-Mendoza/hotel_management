package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.AdministradorGeneralModel;
import com.acm.hotel_gestion.persistence.entities.AdministradorGeneralEntity;
import com.acm.hotel_gestion.persistence.repository.AdministradorGeneralRepository;
import com.acm.hotel_gestion.util.AdministradorGeneralMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdministradorGeneralService {
    private final AdministradorGeneralRepository administradorGeneralRepository;

    public AdministradorGeneralModel saveAdministradorGeneral(AdministradorGeneralModel administradorGeneral) {
        AdministradorGeneralEntity administradorGeneralEntity = administradorGeneralRepository.save(AdministradorGeneralMapper.modelToEntity(administradorGeneral));
        return AdministradorGeneralMapper.entityToModel(administradorGeneralEntity);
    }

    public void deleteById(Long id) {
        administradorGeneralRepository.deleteById(id);
    }

    public AdministradorGeneralModel findById(Long id) {
        AdministradorGeneralEntity administradorGeneralEntity = administradorGeneralRepository.findById(id).orElse(null);
        return administradorGeneralEntity != null ? AdministradorGeneralMapper.entityToModel(administradorGeneralEntity) : null;
    }

    public AdministradorGeneralModel updateAdministradorGeneral(AdministradorGeneralModel administradorGeneral) {
        AdministradorGeneralEntity administradorGeneralEntity =  administradorGeneralRepository.save(AdministradorGeneralMapper.modelToEntity(administradorGeneral));
        return AdministradorGeneralMapper.entityToModel(administradorGeneralEntity);
    }

    public List<AdministradorGeneralModel> findAll() {
        return administradorGeneralRepository.findAll().stream().map(AdministradorGeneralMapper::entityToModel).collect(Collectors.toList());
    }
}
