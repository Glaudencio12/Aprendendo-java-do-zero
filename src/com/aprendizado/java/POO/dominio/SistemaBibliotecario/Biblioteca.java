package com.aprendizado.java.POO.dominio.SistemaBibliotecario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void removerLivro(String isbn){
        livros.removeIf(livro -> livro.getIsbn().equals(isbn));
    }

    public Livro buscarLivro(String isbn){
        for (Livro livro : livros){
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public void exibirTodosOsLivros(){
        for (Livro livro : livros){
            livro.exibirInfo();
            System.out.println();
        }
    }
}
