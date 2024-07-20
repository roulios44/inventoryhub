package com.inventoryhub.inventoryhub.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "commandes")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private double total_price;
    private String delivery_adress;
    private String delivery_postcode;
    private String delivery_country;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    private State state;
    @ManyToOne
    private Type type;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
