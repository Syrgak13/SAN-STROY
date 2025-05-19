package com.san_stroy.repositories.transport_type_repository;

import com.san_stroy.entities.transport_type.ConcreteMixer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConcreteMixerRepository extends JpaRepository<ConcreteMixer, Long> {
    List <ConcreteMixer> findAll();
}
