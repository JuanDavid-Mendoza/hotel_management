package com.acm.hotel_gestion.persistence.repository;

import com.acm.hotel_gestion.persistence.entities.TipoHabitacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoHabitacionRepository extends JpaRepository<TipoHabitacionEntity, Long> {
}
