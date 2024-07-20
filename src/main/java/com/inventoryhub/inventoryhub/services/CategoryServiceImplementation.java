package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.entities.Category;
import com.inventoryhub.inventoryhub.repositories.CategoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryServiceImplementation implements CategoryService {
    @Autowired
    CategoryRepository categoriesRepository;

    @Override
    public List<Category> findAll() {
        return categoriesRepository.findAll();
    }
}
