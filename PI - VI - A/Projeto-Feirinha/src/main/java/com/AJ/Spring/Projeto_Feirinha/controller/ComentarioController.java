package com.AJ.Spring.Projeto_Feirinha.controller;

import com.AJ.Spring.Projeto_Feirinha.model.Comentario;
import com.AJ.Spring.Projeto_Feirinha.service.ComentarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comentario")
public class ComentarioController {
    private final ComentarioService service;

    public ComentarioController(ComentarioService service) {
        this.service = service;
    }

    @PostMapping
    public Comentario criar(@RequestBody Comentario f) {
        return service.criarComentario(f);
    }

    @GetMapping
    public List<Comentario> listar() {
        return service.listarComentarios();
    }

    @GetMapping("/{id}")
    public Comentario buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
