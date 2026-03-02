package com.example.product_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.product_reservation.model.Category;

public interface Repository
        extends JpaRepository<Category, Long> {
}