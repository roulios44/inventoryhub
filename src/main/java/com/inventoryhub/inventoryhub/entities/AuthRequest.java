package com.inventoryhub.inventoryhub.entities;

import lombok.Data;

@Data

public class AuthRequest {
    private String email;
    private String password;
}
