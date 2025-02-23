package com.aprendizado.java.Classes_Abstratas.SistemaLocadora;

public abstract class Veiculo {
    protected String modelo;
    protected double precoDiaria;
    protected final String placa;
    protected CategoriaVeiculo categoriaVeiculo;

    public Veiculo(String placa, String modelo, double precoDiaria, CategoriaVeiculo categoriaVeiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.precoDiaria = precoDiaria;
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public abstract double calcularAluguel(int dias);

    @Override
    public String toString() {
        System.out.println("-".repeat(40));
        return "Veiculo: " + "\n" +
                "Modelo: " + modelo + "\n" +
                "Preco da diária: " + precoDiaria + "\n" +
                "Placa: " + placa + "\n" +
                "Categoria do veículo: " + categoriaVeiculo;
    }
}

