package com.san_stroy.repositories.transport_type_repository;

import com.san_stroy.entities.transport_type.DumpTruck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DumpTruckRepository extends JpaRepository<DumpTruck, Long> {
    List<DumpTruck> findAll();
}
