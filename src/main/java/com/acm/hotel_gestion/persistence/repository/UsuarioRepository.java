package com.acm.hotel_gestion.persistence.repository;

import com.acm.hotel_gestion.persistence.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByNombreUsuario(String nombreUsuario);
}
