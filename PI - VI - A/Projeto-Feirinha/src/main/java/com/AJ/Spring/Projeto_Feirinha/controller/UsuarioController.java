package com.AJ.Spring.Projeto_Feirinha.controller;

import com.AJ.Spring.Projeto_Feirinha.model.Usuario;
import com.AJ.Spring.Projeto_Feirinha.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario f) {
        return service.criarUsuario(f);
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listarUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
