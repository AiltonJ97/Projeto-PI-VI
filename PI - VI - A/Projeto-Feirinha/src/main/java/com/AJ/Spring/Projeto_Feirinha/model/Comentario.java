package com.AJ.Spring.Projeto_Feirinha.model;

import jakarta.persistence.*;

@Entity
public class Comentario {
    @Id
    @GeneratedValue
    private Long id;

    private String texto;
    private int nota;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "feirinha_id")
    private Feirinha feirinha;

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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}