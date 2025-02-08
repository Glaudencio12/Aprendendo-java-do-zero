package com.aprendizado.java.POO.dominio.SistemaGerenciamentoEscolar;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String codigo;
    private List<Estudante> estudantes;

    public Curso(){
        this.codigo = "Não informado";
        this.nome = "Não informado";
        this.estudantes = null;
    }

    public Curso(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
        this.estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante){
        estudantes.add(estudante);
    }

    public void removerEstudante(Estudante estudante){
        estudantes.remove(estudante);
    }

    public void exibirInfo(){
        System.out.println("-".repeat(50));
        System.out.println("Nome do curso: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Estudantes matriculados: ");
        for(Estudante estudante : estudantes){
            System.out.println("Nome: " + estudante.getNome());
            System.out.println("Matrícula: " + estudante.getMatricula());
            System.out.println();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }
}
