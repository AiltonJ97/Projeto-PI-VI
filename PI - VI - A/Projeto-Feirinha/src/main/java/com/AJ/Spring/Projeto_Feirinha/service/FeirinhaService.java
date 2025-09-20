package com.AJ.Spring.Projeto_Feirinha.service;

import com.AJ.Spring.Projeto_Feirinha.model.Feirinha;
import com.AJ.Spring.Projeto_Feirinha.repository.FeirinhaRepository;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class FeirinhaService {
    private final FeirinhaRepository repository;

    public FeirinhaService(FeirinhaRepository repository) {
        this.repository = repository;
    }

    public Feirinha criarFeirinha(Feirinha f) {
        return repository.save(f);
    }

    public List<Feirinha> listarFeirinhas() {
        return repository.findAll();
    }

    public Feirinha buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}