package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.Warehouse;
import com.inventoryhub.inventoryhub.services.WarehouseService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor

@PreAuthorize("isAuthenticated()")
public class WarehousesRestRepository {
    private final WarehouseService warehouseService;

    @GetMapping(path = "/warehouses/all")
    public List<Warehouse> getAllWarehouses(){
        return warehouseService.findAll();
    }
}