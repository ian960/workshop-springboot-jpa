package com.ian.course.repositories;

import com.ian.course.entities.Category;
import com.ian.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
