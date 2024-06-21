package com.lucasrocha.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrocha.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
