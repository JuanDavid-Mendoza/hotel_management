package com.acm.hotel_gestion.persistence.repository;

import com.acm.hotel_gestion.persistence.entities.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaEntity,Long> {
}
