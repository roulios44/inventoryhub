

package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class CustomerDTO implements ExposeDTO{

    private Long id;
    private String name;
}
