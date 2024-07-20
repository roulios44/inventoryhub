package com.inventoryhub.inventoryhub.seeders;

import com.inventoryhub.inventoryhub.entities.Type;
import com.inventoryhub.inventoryhub.repositories.TypeRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TypeSeeder implements ApplicationListener<ContextRefreshedEvent> {

    private final TypeRepository typeRepository;

    public TypeSeeder(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        this.loadTypes();
    }

    private void loadTypes() {
        if (typeRepository.count() == 0) {
            createTypeIfNotFound("Type 1");
            createTypeIfNotFound("Type 2");
        }
    }

    private void createTypeIfNotFound(String name) {
        Optional<Type> type = typeRepository.findByTitle(name);
        if (type.isEmpty()) {
            Type newType = new Type();
            newType.setTitle(name);
            typeRepository.save(newType);
        }
    }
}
