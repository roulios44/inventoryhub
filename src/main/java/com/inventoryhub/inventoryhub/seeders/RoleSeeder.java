package com.inventoryhub.inventoryhub.seeders;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.inventoryhub.inventoryhub.entities.Role;
import com.inventoryhub.inventoryhub.entities.RoleEnum;
import com.inventoryhub.inventoryhub.repositories.RoleRepository;

@Component
public class RoleSeeder implements ApplicationListener<ContextRefreshedEvent> {
    private final RoleRepository roleRepository;


    public RoleSeeder(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        this.loadRoles();
    }

    private void loadRoles() {
        RoleEnum[] roleNames = new RoleEnum[] { RoleEnum.WAREHOUSE_MANAGER, RoleEnum.ADMIN, RoleEnum.CLIENT_COMMERCIAL,RoleEnum.SUPPLIER_COMMERCIAL };
        Map<RoleEnum, String> roleDescriptionMap = Map.of(
            RoleEnum.WAREHOUSE_MANAGER, "Manager d'entrepôts",
            RoleEnum.ADMIN, "Administrateur",
            RoleEnum.CLIENT_COMMERCIAL, "Commercial client",
            RoleEnum.SUPPLIER_COMMERCIAL, "Commercial fournisseur"
        );

        Arrays.stream(roleNames).forEach((roleName) -> {
            Optional<Role> optionalRole = roleRepository.findByTitle(roleName);

            optionalRole.ifPresentOrElse(System.out::println, () -> {
                Role roleToCreate = new Role();

                roleToCreate.setTitle(roleName);
                roleToCreate.setDescription(roleDescriptionMap.get(roleName));

                roleRepository.save(roleToCreate);
            });
        });
    }
}
