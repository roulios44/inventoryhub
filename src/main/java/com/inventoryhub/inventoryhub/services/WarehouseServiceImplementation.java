package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.entities.Warehouse;
import com.inventoryhub.inventoryhub.repositories.WarehouseRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class WarehouseServiceImplementation {

    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<Warehouse> findAll() {
        return warehouseRepository.findAll();
    }
}


