package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.Article;
import com.inventoryhub.inventoryhub.entities.Role;
import com.inventoryhub.inventoryhub.services.ArticleService;
import com.inventoryhub.inventoryhub.services.RoleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@PreAuthorize("isAuthenticated()")
public class RolesRestRepository {
    private final RoleService roleService;

    @GetMapping(path = "/roles/all")
    public List<Role> getAllRoles(){
        return roleService.findAll();
    }
}
