package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.Category;
import com.inventoryhub.inventoryhub.services.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@PreAuthorize("isAuthenticated()")

public class CategoryRestRepository {
    private final CategoryService categoriesService;

    @GetMapping(path = "/categories/all")
    public List<Category> getAllCategories(){
        return categoriesService.findAll();
    }
}