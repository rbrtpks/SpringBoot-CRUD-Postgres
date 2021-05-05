package com.crud.spring.jpa.postgresql.controller;

import com.crud.spring.jpa.postgresql.model.Product;
import com.crud.spring.jpa.postgresql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/products")
	public ResponseEntity<Object[]> getProducts() {
		return this.service.getProducts();
	}

	@PostMapping("/products")
	public ResponseEntity createProducts(@RequestBody  Product product) {
		return this.service.createProducts(product);
	}

}
