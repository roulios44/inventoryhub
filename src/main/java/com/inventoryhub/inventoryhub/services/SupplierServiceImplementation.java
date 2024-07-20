package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventoryhub.inventoryhub.entities.Supplier;
import com.inventoryhub.inventoryhub.repositories.SupplierRepository;

@Service
@Transactional
public class SupplierServiceImplementation implements SupplierService {
    @Autowired
    private SupplierRepository fournisseurRepository;

    @Override
    public List<Supplier> findAll() {
        return fournisseurRepository.findAll();
    }
}
