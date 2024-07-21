package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;
import java.util.Set;

@Data
public class ArticleDTO implements ExposeDTO {
    private Long id;
    private String title;
    private String description;
    private double price;
    private Set<Long> warehouseIds;
    private Set<Long> supplierIds;
}
