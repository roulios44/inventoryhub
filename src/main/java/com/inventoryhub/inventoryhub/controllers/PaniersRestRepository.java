package com.inventoryhub.inventoryhub.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.PanierService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor

public class PaniersRestRepository {
    private PanierService paniersService;
}