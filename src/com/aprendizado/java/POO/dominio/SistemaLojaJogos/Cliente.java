package com.aprendizado.java.POO.dominio.SistemaLojaJogos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int idade;
    private List<Jogo> jogosComprados;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.jogosComprados = new ArrayList<>();
    }

    public void comprarJogo(Jogo... addJogo){
        for (Jogo jogo : addJogo){
            jogosComprados.add(jogo);
        }
    }
    public void dadosCliente(){
        System.out.println("-".repeat(50));
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Jogos comprados: ");
        for (Jogo jogo : jogosComprados){
            System.out.println(jogo.getTitulo());
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogo> getJogosComprados() {
        return jogosComprados;
    }

    public void setJogosComprados(List<Jogo> jogosComprados) {
        this.jogosComprados = jogosComprados;
    }
}
