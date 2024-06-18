package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity
@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String email;
	private Integer edad;
	
	public Usuario(Long id, String nombre, String email, Integer edad) {

		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}
	
	public Usuario() {}

}