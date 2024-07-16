package com.inventoryhub.inventoryhub.controllers; 

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.UserService;


@RestController
@PreAuthorize("isAuthenticated()")
public class UserRestRepository {
    private UserService userService;
    
    public UserRestRepository(UserService userService){
        this.userService = userService;
    }
}
