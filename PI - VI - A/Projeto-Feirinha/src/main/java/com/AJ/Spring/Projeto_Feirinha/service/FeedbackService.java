package com.AJ.Spring.Projeto_Feirinha.service;

import com.AJ.Spring.Projeto_Feirinha.model.Feedback;
import com.AJ.Spring.Projeto_Feirinha.repository.FeedbackRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    private final FeedbackRepository repository;

    public FeedbackService(FeedbackRepository repository) {
        this.repository = repository;
    }

    public Feedback criarFeedback(Feedback f) {
        return repository.save(f);
    }

    public List<Feedback> listarFeedback() {
        return repository.findAll();
    }

    public Feedback buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
