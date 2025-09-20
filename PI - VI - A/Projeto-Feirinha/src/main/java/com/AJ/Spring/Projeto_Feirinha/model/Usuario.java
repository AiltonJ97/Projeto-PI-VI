package com.AJ.Spring.Projeto_Feirinha.model;

import jakarta.persistence.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String email;
    private static String senha;
    private String perfil;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Notificacao> notificacoes;

    @OneToMany(mappedBy = "organizador", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        senha = encoder.encode(senha);
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}