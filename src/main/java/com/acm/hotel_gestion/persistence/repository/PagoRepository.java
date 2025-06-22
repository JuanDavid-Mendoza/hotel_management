package com.acm.hotel_gestion.persistence.repository;

import com.acm.hotel_gestion.persistence.entities.PagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<PagoEntity, Long> {
}
