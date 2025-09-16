package com.AJ.Spring.Projeto_Feirinha.repository;

import com.AJ.Spring.Projeto_Feirinha.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
