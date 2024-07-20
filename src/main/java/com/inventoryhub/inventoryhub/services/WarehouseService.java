package com.inventoryhub.inventoryhub.services;

import java.util.List;

import com.inventoryhub.inventoryhub.entities.Warehouse;

public interface WarehouseService {
    List<Warehouse> findAll();
}
