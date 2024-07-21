package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class RoleDTO implements ExposeDTO{
    private Long id;
    private String title;
}
