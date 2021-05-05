package com.crud.spring.jpa.postgresql.controller;

import com.crud.spring.jpa.postgresql.model.Seller;
import com.crud.spring.jpa.postgresql.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class SellerController {

	@Autowired
	private SellerService service;

	@GetMapping("/sellers")
	public ResponseEntity<Object[]> getSellers() {
		return this.service.getSellers();
	}

	@PostMapping("/sellers")
	public ResponseEntity createSellers(@RequestBody Seller seller) {
		return this.service.createSellers(seller);
	}

}
