package com.AJ.Spring.Projeto_Feirinha.controller;

import com.AJ.Spring.Projeto_Feirinha.model.LoginRequest;
import com.AJ.Spring.Projeto_Feirinha.model.LoginResponse;
import com.AJ.Spring.Projeto_Feirinha.model.Usuario;
import com.AJ.Spring.Projeto_Feirinha.repository.UsuarioRepository;
import com.AJ.Spring.Projeto_Feirinha.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/register")
    public Usuario registrar(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }
}
