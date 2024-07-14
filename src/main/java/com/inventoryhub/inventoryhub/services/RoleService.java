package com.inventoryhub.inventoryhub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.transaction.Transactional;

import com.inventoryhub.inventoryhub.repositories.*;

@Service
@Transactional
public class RoleService{

    @Autowired
    RoleRepository rolesRepository;
}