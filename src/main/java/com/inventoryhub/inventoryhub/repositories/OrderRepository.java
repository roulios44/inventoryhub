package com.inventoryhub.inventoryhub.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // You can add custom queries here if needed
}