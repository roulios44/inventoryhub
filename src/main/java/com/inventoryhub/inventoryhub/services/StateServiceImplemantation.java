package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.entities.State;
import com.inventoryhub.inventoryhub.repositories.StateRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class StateServiceImplemantation implements StateService{
    @Autowired
    StateRepository stateRepository;

    @Override
    public List<State> findAll() {
        return stateRepository.findAll();
    }
}
