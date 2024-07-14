package com.inventoryhub.inventoryhub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import com.inventoryhub.inventoryhub.config.JwtUtil;
import com.inventoryhub.inventoryhub.entities.AuthRequest;
import com.inventoryhub.inventoryhub.entities.User;
import com.inventoryhub.inventoryhub.services.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest authRequest) {
        try {
            System.out.println("TEST JULES");
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
                    System.out.println("2EME TEST");
            return jwtUtil.generateToken(authRequest.getEmail());
        } catch (AuthenticationException e) {
            System.out.println(e);
            throw new RuntimeException("Invalid credentials", e);
        }
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.save(user);
        return "User registered successfully";
    }
}
