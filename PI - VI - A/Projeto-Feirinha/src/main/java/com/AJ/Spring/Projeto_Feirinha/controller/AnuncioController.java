package com.AJ.Spring.Projeto_Feirinha.controller;

import com.AJ.Spring.Projeto_Feirinha.model.Anuncio;

import com.AJ.Spring.Projeto_Feirinha.service.AnuncioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anuncio")
public class AnuncioController {
    private final AnuncioService service;

    public AnuncioController(AnuncioService service) {
        this.service = service;
    }

    @PostMapping
    public Anuncio criar(@RequestBody Anuncio f) {
        return service.criarAnuncio(f);
    }

    @GetMapping
    public List<Anuncio> listar() {
        return service.listarAnuncios();
    }

    @GetMapping("/{id}")
    public Anuncio buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
