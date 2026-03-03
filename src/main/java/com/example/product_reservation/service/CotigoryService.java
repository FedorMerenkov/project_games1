package com.example.product_reservation.service;

import com.example.product_reservation.model.Category;
import com.example.product_reservation.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CotigoryService {
    public Category findById(Long id) {
        return repository.findById(id)
                .orElse(null);
    }
    private final Repository repository;

    public CotigoryService(Repository repository) {
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