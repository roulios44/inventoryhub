package com.inventoryhub.inventoryhub.entities;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "types")

public class Type {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
}
