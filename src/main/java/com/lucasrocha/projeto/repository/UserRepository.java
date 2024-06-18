package com.lucasrocha.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrocha.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
