package com.inventoryhub.inventoryhub.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.entities.Role;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface RoleService{
    List<Role> findAll();
}