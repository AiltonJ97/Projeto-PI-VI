package com.AJ.Spring.Projeto_Feirinha.controller;

import com.AJ.Spring.Projeto_Feirinha.model.Notificacao;
import com.AJ.Spring.Projeto_Feirinha.service.NotificacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notificacao")
public class NotificacaoController {
    private final NotificacaoService service;

    public NotificacaoController(NotificacaoService service) {
        this.service = service;
    }

    @PostMapping
    public Notificacao criar(@RequestBody Notificacao f) {
        return service.criarNotificacao(f);
    }

    @GetMapping
    public List<Notificacao> listar() {
        return service.listarNotificacao();
    }

    @GetMapping("/{id}")
    public Notificacao buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
