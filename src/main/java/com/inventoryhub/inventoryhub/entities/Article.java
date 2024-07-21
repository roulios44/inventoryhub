package com.inventoryhub.inventoryhub.entities;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
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

    @ManyToMany
    @JoinTable(
        name = "article_warehouse",
        joinColumns = @JoinColumn(name = "article_id"),
        inverseJoinColumns = @JoinColumn(name = "warehouse_id")
    )
    private Set<Warehouse> warehouse = new HashSet<>();

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "CREER",
        joinColumns = { @JoinColumn(name = "article_id") },
        inverseJoinColumns = { @JoinColumn(name = "supplier_id") }
    )
    private Set<Supplier> suppliers_id;

    @ManyToMany(mappedBy = "articles")
    private Set<Order> orders = new HashSet<>();
}

