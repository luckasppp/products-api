package com.lucasdev.springboot.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasdev.springboot.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{
}
