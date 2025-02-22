package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciadorSeminarios;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;
    private List<Aluno> alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
        this.alunos = new ArrayList<>();
    }

    public void adiconarLocalizacao(Local local) {
        this.local = local;
    }

    public void adicionarAluno(Aluno... cadastrarAlunos) {
        for (Aluno aluno : cadastrarAlunos) {
           Seminario seminario = aluno.getSeminario();
            if (!seminario.getTitulo().equals(titulo)) {
                System.out.println("O Aluno " + aluno.getNome() + " já está inscrito em outro seminário, não foi possível isncreve-lo");
                System.out.println("-".repeat(80));
            }else{
                alunos.add(aluno);
            }
        }
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("localização: " + local.getEndereco());
        System.out.println("Alunos Inscritos no seminário: ");
        System.out.println("-".repeat(50));
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado neste seminário");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome() + " " + aluno.getIdade() + " anos");
                System.out.println("-".repeat(50));
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
