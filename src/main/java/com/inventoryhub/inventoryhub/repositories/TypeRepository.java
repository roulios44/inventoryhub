package com.inventoryhub.inventoryhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Type;

public interface TypeRepository  extends JpaRepository<Type, Long> {
    
}
