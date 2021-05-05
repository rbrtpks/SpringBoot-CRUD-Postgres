package com.crud.spring.jpa.postgresql.controller;

import com.crud.spring.jpa.postgresql.model.Client;
import com.crud.spring.jpa.postgresql.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private ClientService service;

	@GetMapping("/clients")
	public ResponseEntity<Object[]> getClients() {
		return this.service.getClients();
	}

	@PostMapping("/clients")
	public ResponseEntity createClients(@RequestBody Client client) {
		return this.service.createClients(client);
	}

}
