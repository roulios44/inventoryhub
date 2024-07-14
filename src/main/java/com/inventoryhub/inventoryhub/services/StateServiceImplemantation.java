package com.inventoryhub.inventoryhub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.repositories.StateRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class StateServiceImplemantation {
    @Autowired
    StateRepository stateRepository;
}
