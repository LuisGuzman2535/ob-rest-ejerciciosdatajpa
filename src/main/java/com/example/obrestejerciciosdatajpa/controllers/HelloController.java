package com.example.obrestejerciciosdatajpa.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.varexample}")
    String message;
    @GetMapping("/api/hola")
    public String saludo() {
        System.out.println(message);
        return "HOLA DEVELOPERS!";
    }
}
