package com.crud.spring.jpa.postgresql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "sellers", uniqueConstraints = @UniqueConstraint(columnNames = "code"))
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "code")
    private long code;

    @Column(name = "name")
    private String name;

    public Seller(){
    }
}
