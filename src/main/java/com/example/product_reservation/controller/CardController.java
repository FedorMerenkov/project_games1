package com.example.product_reservation.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CardController {
    @GetMapping("/card")
    public String sayCard() {
        return "Hello World";

    }
}