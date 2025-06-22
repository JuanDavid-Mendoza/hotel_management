package com.acm.hotel_gestion.services;

import com.acm.hotel_gestion.models.UsuarioModel;
import com.acm.hotel_gestion.persistence.entities.UsuarioEntity;
import com.acm.hotel_gestion.persistence.repository.UsuarioRepository;
import com.acm.hotel_gestion.util.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioModel saveUsuario(UsuarioModel usuario) {
        UsuarioEntity usuarioEntity = usuarioRepository.save(UsuarioMapper.modelToEntity(usuario));
        return UsuarioMapper.entityToModel(usuarioEntity);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    public UsuarioModel findById(Long id) {
        UsuarioEntity usuarioEntity = usuarioRepository.findById(id).orElse(null);
        return usuarioEntity != null ? UsuarioMapper.entityToModel(usuarioEntity) : null;
    }

    public UsuarioModel updateUsuario(UsuarioModel usuario) {
        UsuarioEntity usuarioEntity =  usuarioRepository.save(UsuarioMapper.modelToEntity(usuario));
        return UsuarioMapper.entityToModel(usuarioEntity);
    }

    public List<UsuarioModel> findAll() {
        return usuarioRepository.findAll().stream().map(UsuarioMapper::entityToModel).collect(Collectors.toList());
    }
}
