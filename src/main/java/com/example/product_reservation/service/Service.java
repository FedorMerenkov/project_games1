package com.example.product_reservation.service;

import com.example.product_reservation.model.Category;
import com.example.product_reservation.repository.Repository;

import java.util.List;


@org.springframework.stereotype.Service
public class Service {
    public Category findById(Long id) {
        return repository.findById(id)
                .orElse(null); // если хотите возвращать null, если не найдено
    }
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }
    public Category save(Category category) {
        return repository.save(category);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public List<Category> findAll() {
        return repository.findAll();
    }
}