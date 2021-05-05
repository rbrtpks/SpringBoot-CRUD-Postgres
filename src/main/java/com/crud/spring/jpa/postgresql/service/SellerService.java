package com.crud.spring.jpa.postgresql.service;

import com.crud.spring.jpa.postgresql.model.Seller;
import com.crud.spring.jpa.postgresql.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public ResponseEntity<Object[]> getSellers() {
        Object[] sellers = this.repository.findAll().toArray();

        return new ResponseEntity<Object[]>(sellers, HttpStatus.OK);
    }

    public ResponseEntity createSellers(Seller seller) {
        try {
            seller = this.repository.save(seller);

            return new ResponseEntity(seller, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
