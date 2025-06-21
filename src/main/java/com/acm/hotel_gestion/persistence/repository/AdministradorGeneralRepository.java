package com.acm.hotel_gestion.persistence.repository;

import com.acm.hotel_gestion.persistence.entities.AdministradorGeneralEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorGeneralRepository extends JpaRepository<AdministradorGeneralEntity,Long> {
}
