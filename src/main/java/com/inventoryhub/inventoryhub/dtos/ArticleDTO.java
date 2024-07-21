package com.inventoryhub.inventoryhub.dtos;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import lombok.Data;

@Data
public class ArticleDTO implements ExposeDTO {
    private Long id;
    private String title;
    private String description;
    private double price;
    @JsonPropertyDescription("Supplier")
    private Long supplier;
}
