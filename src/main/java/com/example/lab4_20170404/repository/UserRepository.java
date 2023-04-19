package com.example.lab4_20170404.repository;

import com.example.lab4_20170404.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM user where email = ?1 and password = ?2", nativeQuery = true)
    List<User> buscarUsuarioLogin(String email, String password);

}
