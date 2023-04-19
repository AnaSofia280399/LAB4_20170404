package com.example.lab4_20170404.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "vuelo")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvuelo")
    private int idvuelo;

    @Column(nullable = false, name = "origen", length = 45)
    private String origen;

    @Column(nullable = false, name = "destino", length = 45)
    private String destino;

    @Column(name = "fecha_salida" ,nullable = false)
    private Date fecha_salida;

    @Column( name = "precio_llegada" ,nullable = false)
    private DecimalFormat precio_llegada;

    @Column(name = "duracion" ,nullable = false)
    private int duracion;


    @Column(nullable = false, name = "precio")
    private DecimalFormat precio;

    @OneToOne
    @JoinColumn(name = "aerolinea_idaerolinea")
    private Aerolinea aerolinea;

    @Column(name = "asientos_disponibles" ,nullable = false)
    private int asientos_disponibles;

    @Column(nullable = false, name = "descripcion", length = 500)
    private String descripcion;




}
