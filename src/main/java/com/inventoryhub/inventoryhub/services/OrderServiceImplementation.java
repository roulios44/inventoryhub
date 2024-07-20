package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.entities.Order;
import com.inventoryhub.inventoryhub.repositories.OrderRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderServiceImplementation implements OrderService {
    @Autowired
    OrderRepository orderService;

    @Override
    public List<Order> findAll() {
        return orderService.findAll();
    }

    
}
