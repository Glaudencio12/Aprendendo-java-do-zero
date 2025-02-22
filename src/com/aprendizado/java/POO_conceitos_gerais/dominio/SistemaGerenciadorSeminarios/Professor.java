package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciadorSeminarios;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private  String especialidade;
    private List<Seminario> seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = new ArrayList<>();
    }

    public void ministrarSeminario(Seminario... novosSeminarios){
        for (Seminario seminario : novosSeminarios){
            seminarios.add(seminario);
        }
    }

    public void exibriDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Epecialidade: " + especialidade);
        System.out.println("Seminarios que irá ministrar: ");
        System.out.println("-".repeat(50));
        if (seminarios.isEmpty()) {
            System.out.println("Nenhum seminário a ser ministrado!");
        }else{
            for (Seminario seminario : seminarios){
                System.out.println(seminario.getTitulo());
                System.out.println("-".repeat(50));
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
