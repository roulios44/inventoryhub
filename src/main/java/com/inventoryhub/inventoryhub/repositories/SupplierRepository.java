package com.inventoryhub.inventoryhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Supplier;


public interface SupplierRepository extends JpaRepository<Supplier,Long> {
    
}
