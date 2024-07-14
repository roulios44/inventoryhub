package com.inventoryhub.inventoryhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
    // You can add custom queries here if needed
}