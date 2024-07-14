package com.inventoryhub.inventoryhub.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.WarehouseService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor

public class WarehouseRestRepository {
    private WarehouseService warehouseService;
}