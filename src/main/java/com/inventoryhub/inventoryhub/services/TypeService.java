package com.inventoryhub.inventoryhub.services;

import java.util.List;

import com.inventoryhub.inventoryhub.entities.Type;

public interface TypeService{
    List<Type> findAll();
}