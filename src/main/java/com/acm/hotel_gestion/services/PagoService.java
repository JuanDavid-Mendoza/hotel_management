package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.PagoModel;
import com.acm.hotel_gestion.persistence.entities.PagoEntity;
import com.acm.hotel_gestion.persistence.repository.PagoRepository;
import com.acm.hotel_gestion.util.PagoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PagoService {
    private final PagoRepository pagoRepository;

    public PagoModel savePago(PagoModel pago) {
        PagoEntity pagoEntity = pagoRepository.save(PagoMapper.modelToEntity(pago));
        return PagoMapper.entityToModel(pagoEntity);
    }

    public void deleteById(Long id) {
        pagoRepository.deleteById(id);
    }

    public PagoModel findById(Long id) {
        PagoEntity pagoEntity = pagoRepository.findById(id).orElse(null);
        return pagoEntity != null ? PagoMapper.entityToModel(pagoEntity) : null;
    }

    public PagoModel updatePago(PagoModel pago) {
        PagoEntity pagoEntity =  pagoRepository.save(PagoMapper.modelToEntity(pago));
        return PagoMapper.entityToModel(pagoEntity);
    }

    public List<PagoModel> findAll() {
        return pagoRepository.findAll().stream().map(PagoMapper::entityToModel).collect(Collectors.toList());
    }
}
