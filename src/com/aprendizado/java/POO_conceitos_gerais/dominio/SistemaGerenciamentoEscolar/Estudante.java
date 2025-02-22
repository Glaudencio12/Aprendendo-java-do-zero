package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciamentoEscolar;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private String matricula;
    private List<Curso> cursos;

    public Estudante(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.cursos = new ArrayList<>();
    }

    public Estudante(){
        this.nome = "Não inoformado";
        this.matricula = "Não informado";
        this.cursos = null;
    }

    public void matriculaCurso(Curso curso){
        cursos.add(curso);
    }

    public void cancelarCurso(Curso curso){
        cursos.remove(curso);
    }

    public void exibirInfo(){
        System.out.println("-".repeat(50));
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Cursos em que está matriculado: ");
        for(Curso curso : cursos){
            System.out.println("Nome: " + curso.getNome());
            System.out.println("Matrícula: " + curso.getCodigo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

}
