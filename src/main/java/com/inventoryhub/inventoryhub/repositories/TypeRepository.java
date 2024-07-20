package com.inventoryhub.inventoryhub.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Type;


public interface TypeRepository  extends JpaRepository<Type, Long> {
    Optional<Type> findByTitle(String title);
}
