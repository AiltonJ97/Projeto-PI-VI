package com.AJ.Spring.Projeto_Feirinha.service;

import com.AJ.Spring.Projeto_Feirinha.model.Notificacao;
import com.AJ.Spring.Projeto_Feirinha.repository.NotificacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacaoService {
    private final NotificacaoRepository repository;

    public NotificacaoService(NotificacaoRepository repository) {
        this.repository = repository;
    }

    public Notificacao criarNotificacao(Notificacao f) {
        return repository.save(f);
    }

    public List<Notificacao> listarNotificacao() {
        return repository.findAll();
    }

    public Notificacao buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
