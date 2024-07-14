package com.inventoryhub.inventoryhub.entities;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "suppliers")
public class Supplier {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String tel;
    private String mail;
    private String adresse;
    private String codePostal;
    private String pays;
    @ManyToMany
    Set<Article> artId;

}