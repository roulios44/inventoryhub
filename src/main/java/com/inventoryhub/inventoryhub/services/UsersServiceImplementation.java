package com.inventoryhub.inventoryhub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.repositories.UserRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class UsersServiceImplementation {
    @Autowired
    UserRepository userRepository;
}
