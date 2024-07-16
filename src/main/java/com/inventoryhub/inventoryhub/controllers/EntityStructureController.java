// EntityStructureController.java
package com.inventoryhub.inventoryhub.controllers;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("isAuthenticated()")
@RequestMapping("/api/structure")
public class EntityStructureController {

    @GetMapping("/{entityName}")
    public ResponseEntity<List<Map<String, String>>> getEntityStructure(@PathVariable String entityName) {
        try {
            // Construire le nom complet de la classe
            String entityClassName = "com.inventoryhub.inventoryhub.entities." + entityName.substring(0,1).toUpperCase() + entityName.substring(1);
            Class<?> entityClass = Class.forName(entityClassName);
            List<Map<String, String>> structure = getEntityStructure(entityClass);
            return ResponseEntity.ok().body(structure);
        } catch (ClassNotFoundException e) {
            // Renvoyer une réponse avec un code de statut HTTP 404
            return ResponseEntity.notFound().build();
        }
    }

    private List<Map<String, String>> getEntityStructure(Class<?> entityClass) {
        List<Map<String, String>> fieldDescriptors = new ArrayList<>();

        Field[] fields = entityClass.getDeclaredFields();
        for (Field field : fields) {
            Map<String, String> fieldDescriptor = new HashMap<>();
            fieldDescriptor.put("name", field.getName());
            fieldDescriptor.put("type", field.getType().getSimpleName());
            fieldDescriptors.add(fieldDescriptor);
        }
        return fieldDescriptors;
    }
}