package com.inventoryhub.inventoryhub.services;

import java.util.List;

import com.inventoryhub.inventoryhub.entities.Customer;

public interface  CustomerService {
    
    List<Customer> findAll();
}
