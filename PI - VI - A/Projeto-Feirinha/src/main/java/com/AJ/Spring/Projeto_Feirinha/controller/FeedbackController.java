package com.AJ.Spring.Projeto_Feirinha.controller;

import com.AJ.Spring.Projeto_Feirinha.model.Feedback;
import com.AJ.Spring.Projeto_Feirinha.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
    private final FeedbackService service;

    public FeedbackController(FeedbackService service) {
        this.service = service;
    }

    @PostMapping
    public Feedback criar(@RequestBody Feedback f) {
        return service.criarFeedback(f);
    }

    @GetMapping
    public List<Feedback> listar() {
        return service.listarFeedback();
    }

    @GetMapping("/{id}")
    public Feedback buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
