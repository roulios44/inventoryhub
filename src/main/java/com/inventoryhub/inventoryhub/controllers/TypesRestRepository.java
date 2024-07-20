package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.Type;
import com.inventoryhub.inventoryhub.services.TypeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@PreAuthorize("isAuthenticated()")
public class TypesRestRepository {
    private final TypeService typesService;

    @GetMapping(path = "/types/all")
    public List<Type> getAllTypes(){
        return typesService.findAll();
    }
}
