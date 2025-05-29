package com.aprendizado.java.Excecoes.Praticas.Bilblioteca.Models;

public class Usuario {
    private String nome;
    private int id;
    private String email;
    private String telefone;

    public Usuario(String nome, int id, String email, String telefone) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
