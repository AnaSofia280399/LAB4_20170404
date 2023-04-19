package com.example.lab4_20170404.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private int idreserva;

    @Column(name = "fecha_reserva" ,nullable = false)
    private Date fecha_reserva;

    @Column( name = "precio_total" ,nullable = false)
    private DecimalFormat precio_total;

    @Column(nullable = false, name = "estado_pago", length = 45)
    private String estado_pago;

    @OneToOne
    @JoinColumn(name = "user_iduser")
    private User user;

    @OneToOne
    @JoinColumn(name = "vuelo_idvuelo")
    private Vuelo vuelo_idvuelo;




}
