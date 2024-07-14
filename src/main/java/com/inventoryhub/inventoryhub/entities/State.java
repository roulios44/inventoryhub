package com.inventoryhub.inventoryhub.entities;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "etats")

public class State {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
}
