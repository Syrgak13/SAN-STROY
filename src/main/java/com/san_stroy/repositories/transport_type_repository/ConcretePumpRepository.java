package com.san_stroy.repositories.transport_type_repository;

import com.san_stroy.entities.transport_type.ConcretePump;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConcretePumpRepository extends JpaRepository<ConcretePump, Long> {
    List<ConcretePump> findAll();
}
