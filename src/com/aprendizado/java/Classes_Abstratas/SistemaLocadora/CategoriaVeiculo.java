package com.aprendizado.java.Classes_Abstratas.SistemaLocadora;

public enum CategoriaVeiculo {
    ECONOMICO("Econômico"),
    SUV("SUV"),
    SEDAN("Sedan"),
    LUXO("Luxo");

    private String nome;
    CategoriaVeiculo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
