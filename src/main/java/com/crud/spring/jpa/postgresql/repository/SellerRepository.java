package com.crud.spring.jpa.postgresql.repository;

import com.crud.spring.jpa.postgresql.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> { }
