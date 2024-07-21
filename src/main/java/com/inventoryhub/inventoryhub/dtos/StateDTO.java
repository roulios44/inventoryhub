package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class StateDTO implements ExposeDTO{
    private Long id;
    private String name;
}
