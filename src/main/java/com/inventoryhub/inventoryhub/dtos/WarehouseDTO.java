package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class WarehouseDTO implements ExposeDTO{
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
}
