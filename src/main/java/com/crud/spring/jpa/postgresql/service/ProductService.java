package com.crud.spring.jpa.postgresql.service;

import com.crud.spring.jpa.postgresql.model.Product;
import com.crud.spring.jpa.postgresql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ResponseEntity<Object[]> getProducts() {
        Object[] products = this.repository.findAll().toArray();

        return new ResponseEntity<Object[]>(products, HttpStatus.OK);
    }

    public ResponseEntity createProducts(Product product) {
        try {
            product = this.repository.save(product);

            return new ResponseEntity(product, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
