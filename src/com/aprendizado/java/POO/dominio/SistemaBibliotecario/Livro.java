package com.aprendizado.java.POO.dominio.SistemaBibliotecario;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Livro(){
        this.titulo = "Não informado";
        this.autor = "Não informado";
        this.isbn = "Não informado";
    }

    public void exibirInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
