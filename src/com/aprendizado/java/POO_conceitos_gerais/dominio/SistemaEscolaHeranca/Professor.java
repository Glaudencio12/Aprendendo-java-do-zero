package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaEscolaHeranca;

import java.util.ArrayList;
import java.util.List;

public final class Professor extends Pessoa{
    private String numeroRegistro;
    private List<String> disciplinas;
    private Aluno aluno;

    public Professor(String nome, String cpf, int idade, String endereco, String numeroRegistro) {
        super(nome, cpf, idade, endereco);
        this.numeroRegistro = numeroRegistro;
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(String...novaDisciplina){
        for (String disciplina : novaDisciplina){
            if (novaDisciplina.length > 4) {
                System.out.println("*".repeat(40));
                System.out.println("Só podem ser adicionadas 4 disciplinas");
                System.out.println("*".repeat(40));
                return;
            }else{
                disciplinas.add(disciplina);
            }
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de registro: " + numeroRegistro);
        System.out.println("Disciplinas: " + disciplinas.toString());
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
