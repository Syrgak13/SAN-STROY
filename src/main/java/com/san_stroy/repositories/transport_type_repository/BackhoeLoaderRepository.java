package com.san_stroy.repositories.transport_type_repository;

import com.san_stroy.entities.transport_type.BackhoeLoader;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BackhoeLoaderRepository extends JpaRepository<BackhoeLoader, Long> {
    List <BackhoeLoader> findAll();

}
