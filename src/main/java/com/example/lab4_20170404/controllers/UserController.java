package com.example.lab4_20170404.controllers;

import com.example.lab4_20170404.entity.User;
import com.example.lab4_20170404.repository.UserRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = {"", "/"})
    public String login(Model model) {

        return "login/inicio";
    }

    @PostMapping("/logueo")
    public String logueo(User user, @RequestParam("email") String usuarioStr,
                         @RequestParam("password") String passwordStr){

        Optional<User>
        if()
    }





}
