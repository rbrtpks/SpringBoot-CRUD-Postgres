package com.crud.spring.jpa.postgresql.repository;

import com.crud.spring.jpa.postgresql.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> { }
