package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.entities.Role;
import com.inventoryhub.inventoryhub.repositories.RoleRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class RoleServiceImplementation implements RoleService{
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        System.out.println("Hello");
        return roleRepository.findAll();
    }
}
