package com.inventoryhub.inventoryhub.entities;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "commandes")

public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double total_price;
    private String delivery_adress;
    private String delivery_postcode;
    private String delivery_country;
    @ManyToOne
    private State state;
    @ManyToOne
    private Type type;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
