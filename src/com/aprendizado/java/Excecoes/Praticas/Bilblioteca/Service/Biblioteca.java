package com.aprendizado.java.Excecoes.Praticas.Bilblioteca.Service;

import com.aprendizado.java.Excecoes.Praticas.Bilblioteca.Exceptions.*;
import com.aprendizado.java.Excecoes.Praticas.Bilblioteca.Models.Livro;
import com.aprendizado.java.Excecoes.Praticas.Bilblioteca.Models.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Livro> livros;
    private Map<String, String> emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimos = new HashMap<>();
    }

    public void cadastrarLivro(Livro novolivro) throws DuplicateBookExceprion {
        for (Livro livro : livros){
            if (livro != null && livro.getIsbn().equals(novolivro.getIsbn())) {
                throw new DuplicateBookExceprion("Livro com mesmo ISBN já cadastrado na base de dados");
            }
        }
        livros.add(novolivro);
    }

    public void cadastrarUsuario(Usuario novUsuario) throws DuplicateMemberExceprion {
        for (Usuario usuario : usuarios){
            if (usuario != null && usuario.getId() == novUsuario.getId()) {
                throw new DuplicateMemberExceprion("Usuário com mesmo ID já cadastrado na base de dados");
            }
        }
        usuarios.add(novUsuario);
    }

    public void emprestarLivro(int idUsuario, String idLivro) throws MemberNotFoundException, BookNotFoundException, NoCopiesAvailableException {
        String nomeUser = "";
        String tituloLivro = "";
        for (Usuario usuario : usuarios){
            if (usuario.getId() != idUsuario) {
                throw new MemberNotFoundException("Usuário não encontrado");
            }else{
                nomeUser = usuario.getNome();
                break;
            }
        }

        for (Livro livro_ : livros) {
            if (livro_.getIsbn() != idLivro) {
                throw new BookNotFoundException("Livro não encontrado");
            }else{
                tituloLivro = livro_.getTitulo();
                break;
            }
        }

        for (Livro livro_ : livros) {
            if (livro_.getNumCopias() <= 0) {
                throw new NoCopiesAvailableException("Números de cópias igual a 0");
            }else{
                livro_.DecrementarNumCopias();
                break;
            }
        }
        emprestimos.put(nomeUser, tituloLivro);
    }
}
