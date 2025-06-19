package com.ian.course.repositories;

import com.ian.course.entities.Category;
import com.ian.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
