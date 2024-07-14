package com.inventoryhub.inventoryhub.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inventoryhub.inventoryhub.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}