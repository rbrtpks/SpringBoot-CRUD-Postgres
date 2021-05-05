package com.crud.spring.jpa.postgresql.repository;

import com.crud.spring.jpa.postgresql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }
