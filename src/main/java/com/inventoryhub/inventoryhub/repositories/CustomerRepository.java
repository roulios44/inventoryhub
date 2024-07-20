package com.inventoryhub.inventoryhub.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Customer;



public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByTitle(String title);
}
