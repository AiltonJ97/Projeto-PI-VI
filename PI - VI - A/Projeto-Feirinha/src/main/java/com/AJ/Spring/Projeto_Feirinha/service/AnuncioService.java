package com.AJ.Spring.Projeto_Feirinha.service;

import com.AJ.Spring.Projeto_Feirinha.model.Anuncio;
import com.AJ.Spring.Projeto_Feirinha.repository.AnuncioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnuncioService {
    private final AnuncioRepository repository;

    public AnuncioService(AnuncioRepository repository) {
        this.repository = repository;
    }

    public Anuncio criarAnuncio(Anuncio f) {
        return repository.save(f);
    }

    public List<Anuncio> listarAnuncios() {
        return repository.findAll();
    }

    public Anuncio buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
