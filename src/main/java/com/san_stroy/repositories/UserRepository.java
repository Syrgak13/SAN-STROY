package com.san_stroy.repositories;

import com.san_stroy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
