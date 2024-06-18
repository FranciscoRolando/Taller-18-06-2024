package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

}
