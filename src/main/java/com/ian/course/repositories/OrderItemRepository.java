package com.ian.course.repositories;

import com.ian.course.entities.OrderItem;
import com.ian.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
