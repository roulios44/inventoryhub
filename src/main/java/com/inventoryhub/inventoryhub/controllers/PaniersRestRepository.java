package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.Panier;
import com.inventoryhub.inventoryhub.services.PanierService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@PreAuthorize("isAuthenticated()")
public class PaniersRestRepository {
    private final PanierService paniersService;

    @GetMapping(path = "/paniers/all")
    public List<Panier> getAllPaniers(){
        return paniersService.findAll();
    }
}