package com.acm.hotel_gestion.persistence.repository;

import com.acm.hotel_gestion.persistence.entities.AdministradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<AdministradorEntity,Long> {
}
