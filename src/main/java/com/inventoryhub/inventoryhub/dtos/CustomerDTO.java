

package com.inventoryhub.inventoryhub.dtos;

import lombok.Data;

@Data
public class CustomerDTO implements ExposeDTO{

    private Long id;
    private String title;
    private String description;
    private String tel;
    private String email;
    private String adresse;
    private String codePostal;
    private String pays;
}
