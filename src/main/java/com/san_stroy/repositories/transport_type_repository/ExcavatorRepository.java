package com.san_stroy.repositories.transport_type_repository;

import com.san_stroy.entities.transport_type.Excavator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExcavatorRepository extends JpaRepository<Excavator, Long> {
    List<Excavator> findAll();
}
