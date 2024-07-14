package com.inventoryhub.inventoryhub.entities;



import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "paniers")

public class Panier {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double total_price;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "CREER",
        joinColumns = { @JoinColumn(name = "article_id") },
        inverseJoinColumns = { @JoinColumn(name = "fournisseur_id") }
    )
    private Set<Warehouse> warehouses = new HashSet<>();
}

