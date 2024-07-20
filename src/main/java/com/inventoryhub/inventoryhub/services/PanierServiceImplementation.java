package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.entities.Panier;
import com.inventoryhub.inventoryhub.repositories.PanierRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class PanierServiceImplementation implements PanierService{
    @Autowired
    PanierRepository paniersRepository;

    @Override
    public List<Panier> findAll() {
        return paniersRepository.findAll();
    }
}
