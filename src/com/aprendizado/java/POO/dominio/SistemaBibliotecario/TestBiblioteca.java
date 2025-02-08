package com.aprendizado.java.POO.dominio.SistemaBibliotecario;

public class TestBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O jumento assasino","Glaudencio","9I3933");
        Livro livro2 = new Livro("O assasino","Glaudencio","9I3833");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.exibirTodosOsLivros();
        biblioteca.removerLivro("9I3933");
        biblioteca.exibirTodosOsLivros();
        Livro livro = biblioteca.buscarLivro("9I3933");
        if (livro == null) {
            System.out.println("Livro não encontrado!");
        }else{
            livro.exibirInfo();
        }
    }
}
