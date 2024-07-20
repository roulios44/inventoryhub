package com.inventoryhub.inventoryhub.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByOrderNumber(String orderNumber);
}