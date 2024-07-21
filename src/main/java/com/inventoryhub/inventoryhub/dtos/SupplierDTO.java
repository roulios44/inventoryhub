package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class SupplierDTO implements ExposeDTO{
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String description;
}
