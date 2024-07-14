package com.inventoryhub.inventoryhub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.repositories.WarehouseRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class WarehouseServiceImplementation {

    @Autowired
    private WarehouseRepository warehouseRepository;

    // ajoutez des méthodes pour manipuler les entrepôts
}

