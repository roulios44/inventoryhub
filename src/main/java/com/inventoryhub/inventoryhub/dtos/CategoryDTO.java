package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class CategoryDTO implements ExposeDTO {
    private Long id;
    private String title;
    private String description;
}
