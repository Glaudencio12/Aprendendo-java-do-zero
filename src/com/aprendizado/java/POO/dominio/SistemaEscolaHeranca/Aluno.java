package com.aprendizado.java.POO.dominio.SistemaEscolaHeranca;

import java.util.ArrayList;
import java.util.List;

public final class Aluno extends Pessoa{
    private String matricula;
    private List<Double> notas;

    public Aluno(String nome, String cpf, int idade, String endereco, String matricula) {
        super(nome, cpf, idade, endereco);
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public void adicionarNotas(double...addNotas){
        for (double nota : addNotas){
            if (addNotas.length == 3) {
                notas.add(nota);
            }else{
                System.out.println("*".repeat(40));
                System.out.println("Só podem ser adicionadas 3 notas");
                System.out.println("*".repeat(40));
                return;
            }
        }
    }

    public void calcularMedia(){
        double soma = 0;
        if (!notas.isEmpty()) {
            for (double nota : notas){
                soma += nota;
            }
            System.out.println("Média das notas: " + soma/notas.size());
        }else{
            System.out.println("Nenhum nota para calculo");
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas: " + notas.toString());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
