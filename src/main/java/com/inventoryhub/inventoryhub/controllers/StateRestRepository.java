package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.State;
import com.inventoryhub.inventoryhub.services.StateService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@PreAuthorize("isAuthenticated()")
public class StateRestRepository {
    private final StateService stateService;

    @GetMapping(path = "/states/all")
    public List<State> getAllStates(){
        return stateService.findAll();
    }
}
