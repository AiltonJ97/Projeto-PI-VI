package com.AJ.Spring.Projeto_Feirinha.controller;

import com.AJ.Spring.Projeto_Feirinha.model.Feirinha;
import com.AJ.Spring.Projeto_Feirinha.service.FeirinhaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feirinhas")
public class FeirinhaController {
    private final FeirinhaService service;

    public FeirinhaController(FeirinhaService service) {
        this.service = service;
    }

    @PostMapping
    public Feirinha criar(@RequestBody Feirinha f) {
        return service.criarFeirinha(f);
    }

    @GetMapping
    public List<Feirinha> listar() {
        return service.listarFeirinhas();
    }

    @GetMapping("/{id}")
    public Feirinha buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
