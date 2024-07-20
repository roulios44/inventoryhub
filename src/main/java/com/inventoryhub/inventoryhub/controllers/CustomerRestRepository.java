package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.Customer;
import com.inventoryhub.inventoryhub.services.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@PreAuthorize("isAuthenticated()")
public class CustomerRestRepository {
    private final CustomerService customerService;

    @GetMapping(path = "/customers/all")
    public List<Customer> getAllCustomers(){
        return customerService.findAll();
    }
}
