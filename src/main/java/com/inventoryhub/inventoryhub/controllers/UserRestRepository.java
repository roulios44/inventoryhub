package com.inventoryhub.inventoryhub.controllers; 

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.User;
import com.inventoryhub.inventoryhub.services.UserService;


@RestController
@PreAuthorize("isAuthenticated()")
public class UserRestRepository {
    private final UserService userService;
    
    public UserRestRepository(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path = "/users/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }
}
