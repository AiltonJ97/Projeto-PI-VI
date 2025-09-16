package com.AJ.Spring.Projeto_Feirinha.repository;

import com.AJ.Spring.Projeto_Feirinha.model.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
}
