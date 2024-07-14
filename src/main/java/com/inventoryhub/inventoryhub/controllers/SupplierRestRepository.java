package com.inventoryhub.inventoryhub.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.SupplierService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class SupplierRestRepository {
    private SupplierService fournisseursService;

    
}
