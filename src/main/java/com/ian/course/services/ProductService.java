package com.ian.course.services;

import com.ian.course.entities.Product;
import com.ian.course.repositories.ProductRepository;
import com.ian.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }
    public Product findById(Long id) {
        Optional<Product> obj  = repository.findById(id);
        return obj.get();
    }

}
