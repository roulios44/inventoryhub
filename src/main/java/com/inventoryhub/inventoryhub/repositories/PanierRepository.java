package com.inventoryhub.inventoryhub.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Panier;

public interface PanierRepository extends JpaRepository<Panier, Long> {
    // You can add custom queries here if needed
}