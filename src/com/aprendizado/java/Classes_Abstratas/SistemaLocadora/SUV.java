package com.aprendizado.java.Classes_Abstratas.SistemaLocadora;

public class SUV extends Veiculo {

    public SUV(String placa, String modelo, double precoDiaria, CategoriaVeiculo categoriaVeiculo) {
        super(placa, modelo, precoDiaria, categoriaVeiculo);
    }

    @Override
    public double calcularAluguel(int dias) {
        return (precoDiaria * dias) * 1.15;
    }
}
