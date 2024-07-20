package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.Supplier;
import com.inventoryhub.inventoryhub.services.SupplierService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:5173")
@PreAuthorize("isAuthenticated()")
public class SupplierRestRepository {
    private final SupplierService supplierService;

    @GetMapping(path = "/suppliers/all")
    public List<Supplier> getAllSuppliers(){
        return supplierService.findAll();
    }

    
}
