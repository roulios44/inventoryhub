package com.inventoryhub.inventoryhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inventoryhub.inventoryhub.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // You can add custom queries here if needed
}