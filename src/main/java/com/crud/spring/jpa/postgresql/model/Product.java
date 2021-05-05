package com.crud.spring.jpa.postgresql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "products", uniqueConstraints = @UniqueConstraint (columnNames = "code"))
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "code")
	private long code;

	@Column(name = "name")
	private String name;

	public Product(){
	}
}
