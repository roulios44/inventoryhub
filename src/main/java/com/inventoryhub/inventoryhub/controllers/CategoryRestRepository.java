package com.inventoryhub.inventoryhub.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")

public class CategoryRestRepository {
    private CategoryService categoriesService;
}