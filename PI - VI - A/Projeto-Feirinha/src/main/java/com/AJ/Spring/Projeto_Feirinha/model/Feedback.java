package com.AJ.Spring.Projeto_Feirinha.model;

import jakarta.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;

    private String texto;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private Usuario organizador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Usuario organizador) {
        this.organizador = organizador;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}