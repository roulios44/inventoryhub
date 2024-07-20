package com.inventoryhub.inventoryhub.services;

import java.util.List;

import com.inventoryhub.inventoryhub.entities.Category;

public interface CategoryService {
    List<Category> findAll();
}
