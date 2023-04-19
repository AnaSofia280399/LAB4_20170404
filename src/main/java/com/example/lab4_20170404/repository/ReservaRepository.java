package com.example.lab4_20170404.repository;

import com.example.lab4_20170404.entity.Reserva;
import com.example.lab4_20170404.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
