package com.AJ.Spring.Projeto_Feirinha.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Anuncio {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private boolean ativo;

    @ManyToOne
    @JoinColumn(name = "feirinha_id")
    private Feirinha feirinha;

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Feirinha getFeirinha() {
        return feirinha;
    }

    public void setFeirinha(Feirinha feirinha) {
        this.feirinha = feirinha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
