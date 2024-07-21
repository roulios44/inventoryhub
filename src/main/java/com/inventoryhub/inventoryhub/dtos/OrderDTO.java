
package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class OrderDTO implements ExposeDTO{

    private Long id;
    private String name;
}
