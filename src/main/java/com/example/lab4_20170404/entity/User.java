package com.example.lab4_20170404.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int iduser;

    @Column(name = "username" ,nullable = false, length = 45)
    private String username;

    @Column( name = "email" ,nullable = false, length = 45)
    private String email;

    @Column(nullable = false, name = "password", length = 45)
    private String password;

}
