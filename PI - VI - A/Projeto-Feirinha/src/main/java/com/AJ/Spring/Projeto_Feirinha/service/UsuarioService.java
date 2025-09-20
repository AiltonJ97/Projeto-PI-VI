package com.AJ.Spring.Projeto_Feirinha.service;

import com.AJ.Spring.Projeto_Feirinha.model.Usuario;
import com.AJ.Spring.Projeto_Feirinha.repository.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public Usuario criarUsuario(Usuario f) {
        Usuario.setSenha(passwordEncoder.encode(Usuario.getSenha()));
        return repository.save(f);
    }

    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
