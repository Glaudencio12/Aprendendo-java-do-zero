package com.aprendizado.java.POO.dominio.SistemaEscolaHeranca;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Pessoa> professores;
    private List<Pessoa> alunos;

    public Escola(String nome){
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public final void addProfessor(Professor professor){
        professores.add(professor);
    }

    public final void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public final void listarProf(){
        System.out.println("Professores: ");
        System.out.println("-".repeat(40));
        for (Pessoa professor : professores){
            professor.exibirDados();
            System.out.println("-".repeat(40));
        }
    }

    public final void listarAluno(){
        System.out.println("Alunos: ");
        System.out.println("-".repeat(40));
        for (Pessoa aluno : alunos){
            aluno.exibirDados();
            System.out.println("-".repeat(40));
        }
    }
}
