package com.inventoryhub.inventoryhub.services;

import java.util.List;

import com.inventoryhub.inventoryhub.entities.User;

public interface UserService{

    void save(User user);

    List<User> findAll();

}