package com.inventoryhub.inventoryhub.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.StateService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
public class StateRestRepository {
    private StateService stateService;
}
