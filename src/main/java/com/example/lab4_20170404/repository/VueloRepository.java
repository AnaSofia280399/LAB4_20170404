package com.example.lab4_20170404.repository;

import com.example.lab4_20170404.entity.User;
import com.example.lab4_20170404.entity.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
}
