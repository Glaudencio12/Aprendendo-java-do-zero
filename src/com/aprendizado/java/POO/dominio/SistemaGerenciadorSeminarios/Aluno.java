package com.aprendizado.java.POO.dominio.SistemaGerenciadorSeminarios;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void adicionarSemininario(Seminario seminario){
        this.seminario = seminario;
    }

    public void exibirDadosAluno(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cadastrado no seminário: " + seminario.getTitulo());
        System.out.println("-".repeat(50));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
