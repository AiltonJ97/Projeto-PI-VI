package com.AJ.Spring.Projeto_Feirinha.repository;

import com.AJ.Spring.Projeto_Feirinha.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
