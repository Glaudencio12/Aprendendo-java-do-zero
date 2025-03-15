package com.aprendizado.java.Interfaces.Abrigo_De_Animais;

public class Gato implements Animal{
    private String nome;
    private int idade;
    private String especie;

    public Gato(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau, miau, miau");
    }

    @Override
    public void mover() {
        System.out.println("Anda silenciomente e pula");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Espécie: " + especie);
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
