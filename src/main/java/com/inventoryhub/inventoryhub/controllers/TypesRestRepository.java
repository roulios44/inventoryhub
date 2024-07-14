package com.inventoryhub.inventoryhub.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.TypeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor

public class TypesRestRepository {
    private TypeService typesService;
}
