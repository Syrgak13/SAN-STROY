package com.san_stroy.repositories;

import com.san_stroy.entities.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransportRepository extends JpaRepository<Transport, Long> {

    List<Transport> findAll();

}
