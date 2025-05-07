package com.aprendizado.java.Classes_Utilitarias.Strings.Excecoes.Praticas.Bilblioteca.app;

import com.aprendizado.java.Classes_Utilitarias.Strings.Excecoes.Praticas.Bilblioteca.Exceptions.*;
import com.aprendizado.java.Classes_Utilitarias.Strings.Excecoes.Praticas.Bilblioteca.Models.Livro;
import com.aprendizado.java.Classes_Utilitarias.Strings.Excecoes.Praticas.Bilblioteca.Models.Usuario;
import com.aprendizado.java.Classes_Utilitarias.Strings.Excecoes.Praticas.Bilblioteca.Service.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro l1 = new Livro("O lobo", "AB323", "Glaudencio", "2024", 5);
        Usuario user1 = new Usuario("Raimundo", 12, "glaudencio@fjfjf", "98437747");

        try {
            biblioteca.cadastrarLivro(l1);
        } catch (DuplicateBookExceprion e) {
            System.err.println("Erro: " + e.getMessage());;
        }

        try {
            biblioteca.cadastrarUsuario(user1);
        } catch (DuplicateMemberExceprion e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            biblioteca.emprestarLivro(12, "AB323");

        } catch (MemberNotFoundException | BookNotFoundException | NoCopiesAvailableException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
