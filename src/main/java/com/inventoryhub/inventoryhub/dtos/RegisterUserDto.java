package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class RegisterUserDto implements ExposeDTO{
    private String email;
    
    private String password;
    
    private String name;

    private String surname;

    private Long role;    
}