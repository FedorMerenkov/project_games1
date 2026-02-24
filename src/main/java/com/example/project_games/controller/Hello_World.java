package com.example.project_games.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Hello_World {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
