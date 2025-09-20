package com.AJ.Spring.Projeto_Feirinha.service;

import com.AJ.Spring.Projeto_Feirinha.model.Comentario;
import com.AJ.Spring.Projeto_Feirinha.repository.ComentarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {
    private final ComentarioRepository repository;

    public ComentarioService(ComentarioRepository repository) {
        this.repository = repository;
    }

    public Comentario criarComentario(Comentario f) {
        return repository.save(f);
    }

    public List<Comentario> listarComentarios() {
        return repository.findAll();
    }

    public Comentario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
