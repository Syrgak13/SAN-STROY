package com.san_stroy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransportRepository extends JpaRepository<TransportRepository, Long> {

    List<TransportRepository> findAll();

}
