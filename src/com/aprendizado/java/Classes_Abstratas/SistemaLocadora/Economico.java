package com.aprendizado.java.Classes_Abstratas.SistemaLocadora;

public class Economico extends Veiculo {

    public Economico(String placa, String modelo, double precoDiaria, CategoriaVeiculo categoriaVeiculo) {
        super(placa, modelo, precoDiaria, categoriaVeiculo);
    }

    @Override
    public double calcularAluguel(int dias) {
        return precoDiaria * dias;
    }
}
