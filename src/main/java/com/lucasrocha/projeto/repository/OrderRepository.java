package com.lucasrocha.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrocha.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order , Long>{

}
