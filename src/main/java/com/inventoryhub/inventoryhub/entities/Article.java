package com.inventoryhub.inventoryhub.entities;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "articles")
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
    @ManyToMany
    private Set<Warehouse> warehouse = new HashSet<>();
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "CREER",
        joinColumns = { @JoinColumn(name = "article_id") },
        inverseJoinColumns = { @JoinColumn(name = "fournisseur_id") }
        )
    private Set<Supplier> suppliers_id;
}
