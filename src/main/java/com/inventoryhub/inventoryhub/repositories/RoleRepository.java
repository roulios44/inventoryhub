package com.inventoryhub.inventoryhub.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Role;
import com.inventoryhub.inventoryhub.entities.RoleEnum;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByTitle(RoleEnum title);
    // You can add custom queries here if needed
}