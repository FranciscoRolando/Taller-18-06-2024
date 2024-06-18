package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Mi API", description = "API de ejemplo")
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	private final UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@Operation(summary = "GetAllUsuarios", description = "Devuelve un listado de usuarios")
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getAllUsuarios() {
		
		 List<Usuario>  resultado = usuarioService.getAllUsuarios();
		if(resultado!= null){
		return new ResponseEntity(resultado, HttpStatus.OK);
		}else {
			return new ResponseEntity( HttpStatus.NOT_FOUND);
		}
		 
	}

}
