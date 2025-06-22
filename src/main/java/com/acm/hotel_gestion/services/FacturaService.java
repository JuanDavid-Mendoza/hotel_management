package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.FacturaModel;
import com.acm.hotel_gestion.persistence.entities.FacturaEntity;
import com.acm.hotel_gestion.persistence.repository.FacturaRepository;
import com.acm.hotel_gestion.util.FacturaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FacturaService {
    private final FacturaRepository facturaRepository;

    public FacturaModel saveFactura(FacturaModel factura) {
        FacturaEntity facturaEntity = facturaRepository.save(FacturaMapper.modelToEntity(factura));
        return FacturaMapper.entityToModel(facturaEntity);
    }

    public void deleteById(Long id) {
        facturaRepository.deleteById(id);
    }

    public FacturaModel findById(Long id) {
        FacturaEntity facturaEntity = facturaRepository.findById(id).orElse(null);
        return facturaEntity != null ? FacturaMapper.entityToModel(facturaEntity) : null;
    }

    public FacturaModel updateFactura(FacturaModel factura) {
        FacturaEntity facturaEntity =  facturaRepository.save(FacturaMapper.modelToEntity(factura));
        return FacturaMapper.entityToModel(facturaEntity);
    }

    public List<FacturaModel> findAll() {
        return facturaRepository.findAll().stream().map(FacturaMapper::entityToModel).collect(Collectors.toList());
    }
}
