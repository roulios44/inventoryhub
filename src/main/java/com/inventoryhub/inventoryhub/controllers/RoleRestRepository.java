package com.inventoryhub.inventoryhub.controllers; 

import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.RoleService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor

public class RoleRestRepository {
    private RoleService rolesService;
    
}
