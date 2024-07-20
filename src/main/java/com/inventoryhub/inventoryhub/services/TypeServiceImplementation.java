package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.entities.Type;
import com.inventoryhub.inventoryhub.repositories.TypeRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class TypeServiceImplementation implements TypeService {
    @Autowired
    private TypeRepository typeRepository;

    @Override
    public List<Type> findAll() {
        return typeRepository.findAll();
    }
}
