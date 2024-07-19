package com.inventoryhub.inventoryhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
    
}
