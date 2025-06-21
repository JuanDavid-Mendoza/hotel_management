package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.ClienteModel;
import com.acm.hotel_gestion.persistence.entities.ClienteEntity;
import com.acm.hotel_gestion.persistence.repository.ClienteRepository;
import com.acm.hotel_gestion.util.ClienteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteModel saveCliente(ClienteModel cliente) {
        ClienteEntity clienteEntity = clienteRepository.save(ClienteMapper.modelToEntity(cliente));
        return ClienteMapper.entityToModel(clienteEntity);
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    public ClienteModel findById(Long id) {
        ClienteEntity clienteEntity = clienteRepository.findById(id).orElse(null);
        return clienteEntity != null ? ClienteMapper.entityToModel(clienteEntity) : null;
    }

    public ClienteModel updateCliente(ClienteModel cliente) {
        ClienteEntity clienteEntity =  clienteRepository.save(ClienteMapper.modelToEntity(cliente));
        return ClienteMapper.entityToModel(clienteEntity);
    }

    public List<ClienteModel> findAll() {
        return clienteRepository.findAll().stream().map(ClienteMapper::entityToModel).collect(Collectors.toList());
    }
}
