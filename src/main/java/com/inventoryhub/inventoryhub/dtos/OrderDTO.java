
package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class OrderDTO {

    private Long id;
    private String name;

    // Constructors, getters and setters

    public OrderDTO() {
    }

    public OrderDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
