package com.inventoryhub.inventoryhub.entities;



import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user",uniqueConstraints = {
    @UniqueConstraint(columnNames = "email")
})

public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    @ManyToOne
    private Role role;
    @OneToMany(mappedBy = "user")
    private List<Order> orders;

}
