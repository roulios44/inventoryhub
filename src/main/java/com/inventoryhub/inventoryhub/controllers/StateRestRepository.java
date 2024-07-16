package com.inventoryhub.inventoryhub.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.StateService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@PreAuthorize("isAuthenticated()")
public class StateRestRepository {
    private StateService stateService;
}
