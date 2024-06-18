package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Usuario;

//Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
}
