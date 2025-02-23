package com.aprendizado.java.Classes_Abstratas.SistemaLocadora;

public class Luxo extends Veiculo{

    public Luxo(String placa, String modelo, double precoDiaria, CategoriaVeiculo categoriaVeiculo) {
        super(placa, modelo, precoDiaria, categoriaVeiculo);
    }

    @Override
    public double calcularAluguel(int dias) {
        return ((precoDiaria * dias) * 1.30) + 100;
    }
}
