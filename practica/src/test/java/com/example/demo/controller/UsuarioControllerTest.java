package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;
import com.fasterxml.jackson.databind.ObjectMapper;
@SpringBootTest
@AutoConfigureMockMvc
class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsuarioService usuarioService;


    @Test
    void testGetAllUsuarios() throws Exception {
        // Arrange
        List<Usuario> usuarios = Arrays.asList(
                new Usuario(1L, "Juan", "juan@example.com", 25),
                new Usuario(2L, "Maria", "maria@example.com", 30)
        );
        when(usuarioService.getAllUsuarios()).thenReturn(usuarios);

        // Act
        ResultActions result = mockMvc.perform(get("/api/usuarios/all"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));

        // Assert
        assertNotNull(result);
    }

    
    @Test
    void testGetAllUsuariosNull() throws Exception {
        // Arrange
        List<Usuario> usuarios = null;
        when(usuarioService.getAllUsuarios()).thenReturn(usuarios);

        // Act
        ResultActions result = mockMvc.perform(get("/api/usuarios/all"))
                .andExpect(status().isNotFound());

        // Assert
        assertNotNull(result);
    }

}

