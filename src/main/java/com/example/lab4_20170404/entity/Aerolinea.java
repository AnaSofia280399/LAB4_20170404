package com.example.lab4_20170404.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "aerolinea")
public class Aerolinea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaerolinea")
    private int idaerolinea;

    @Column(name = "nombre" ,nullable = false, length = 45)
    private String nombre;

    @Column( name = "codigo" ,nullable = false, length = 45)
    private String codigo;

}
