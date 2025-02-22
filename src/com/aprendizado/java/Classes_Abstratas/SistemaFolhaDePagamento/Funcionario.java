package com.aprendizado.java.Classes_Abstratas.SistemaFolhaDePagamento;

public abstract class Funcionario {
    protected String nome;
    protected int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        System.out.println("-".repeat(40));
        return "Funcionario: " + "\n" +
                "nome: " + nome + "\n" +
                "id: " + id + "\n" +
                "salário: " + calcularSalario();
    }
}
