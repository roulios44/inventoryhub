package com.inventoryhub.inventoryhub.entities;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "entrepots")

public class Warehouse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adresse;
    private String codePostal;
    private String pays;
    @ManyToMany
    @JoinTable(
        name = "STOCKER",
        joinColumns = @JoinColumn(name = "entrepot_id"),
        inverseJoinColumns = @JoinColumn(name = "article_id"))
    private Set<Article> articles = new HashSet<>();
}
