package com.inventoryhub.inventoryhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
