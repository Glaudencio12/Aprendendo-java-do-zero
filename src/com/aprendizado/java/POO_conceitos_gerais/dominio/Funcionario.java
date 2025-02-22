package com.aprendizado.java.POO_conceitos_gerais.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void mediaSalarios(){
        double soma = 0;
        if (this.salarios == null) {
            return;
        }
        for (double num : this.salarios){
           soma += num;
        }
        System.out.println(soma / this.salarios.length );
    }

    public void imprimir() {
        System.out.println("Idade: " + this.idade);
        if (this.salarios == null) {
            return;
        }
        System.out.println("Salários: ");
        for (double num : salarios){
            System.out.println(num + " " + " R$");
        }
        System.out.println("Mèdia dos salàrios: ");

        mediaSalarios();
    }
}
