package com.aprendizado.java.Excecoes.Praticas.Bilblioteca.Models;

public class Livro {
    private String titulo;
    private String isbn;
    private String autor;
    private String anoPublicacao;
    private int numCopias;
    private boolean diponivel;

    public Livro(String titulo, String isbn, String autor, String anoPublicacao, int numCopias) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numCopias = numCopias;
        this.diponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void DecrementarNumCopias() {
        this.numCopias--;
    }

    public void incrementarNumCopias() {
        this.numCopias++;
    }

    public boolean isDiponivel() {
        return diponivel;
    }

    public void setDiponivel(boolean diponivel) {
        this.diponivel = diponivel;
    }
}
