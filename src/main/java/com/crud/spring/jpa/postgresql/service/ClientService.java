package com.crud.spring.jpa.postgresql.service;

import com.crud.spring.jpa.postgresql.model.Client;
import com.crud.spring.jpa.postgresql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public ResponseEntity<Object[]> getClients() {
        Object[] clients = this.repository.findAll().toArray();

        return new ResponseEntity<Object[]>(clients, HttpStatus.OK);
    }

public ResponseEntity createClients(Client client) {
    try {
//        System.out.println("client@@@@@@@@@@@@@@@@@@@@@@ "+client);
        client = this.repository.save(client);

        return new ResponseEntity(client, HttpStatus.OK);
    } catch (Exception e){
        return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
}
