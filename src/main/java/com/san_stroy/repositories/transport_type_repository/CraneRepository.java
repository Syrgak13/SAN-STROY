package com.san_stroy.repositories.transport_type_repository;

import com.san_stroy.entities.transport_type.Crane;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CraneRepository extends JpaRepository<Crane, Long> {
    List<Crane> findAll();
}
