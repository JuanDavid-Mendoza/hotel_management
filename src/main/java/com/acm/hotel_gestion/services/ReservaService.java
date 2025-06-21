package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.ReservaModel;
import com.acm.hotel_gestion.persistence.entities.ReservaEntity;
import com.acm.hotel_gestion.persistence.repository.ReservaRepository;
import com.acm.hotel_gestion.util.ReservaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservaService {
    private final ReservaRepository reservaRepository;

    public ReservaModel saveReserva(ReservaModel reserva) {
        ReservaEntity reservaEntity = reservaRepository.save(ReservaMapper.modelToEntity(reserva));
        return ReservaMapper.entityToModel(reservaEntity);
    }

    public void deleteById(Long id) {
        reservaRepository.deleteById(id);
    }

    public ReservaModel findById(Long id) {
        ReservaEntity reservaEntity = reservaRepository.findById(id).orElse(null);
        return reservaEntity != null ? ReservaMapper.entityToModel(reservaEntity) : null;
    }

    public ReservaModel updateReserva(ReservaModel reserva) {
        ReservaEntity reservaEntity =  reservaRepository.save(ReservaMapper.modelToEntity(reserva));
        return ReservaMapper.entityToModel(reservaEntity);
    }

    public List<ReservaModel> findAll() {
        return reservaRepository.findAll().stream().map(ReservaMapper::entityToModel).collect(Collectors.toList());
    }
}
