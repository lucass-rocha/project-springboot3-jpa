package com.lucasrocha.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrocha.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
