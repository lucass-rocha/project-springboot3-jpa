package com.lucasrocha.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrocha.projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
