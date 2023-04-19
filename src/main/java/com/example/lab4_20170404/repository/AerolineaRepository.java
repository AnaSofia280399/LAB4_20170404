package com.example.lab4_20170404.repository;

import com.example.lab4_20170404.entity.Aerolinea;
import com.example.lab4_20170404.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AerolineaRepository extends JpaRepository<Aerolinea, Integer> {
}
