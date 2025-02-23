package com.aprendizado.java.Classes_Abstratas.SistemaLocadora;

public class Sedan extends Veiculo{

    public Sedan(String placa, String modelo, double precoDiaria, CategoriaVeiculo categoriaVeiculo) {
        super(placa, modelo, precoDiaria, categoriaVeiculo);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = precoDiaria * dias;
        if (dias > 7) {
            total *= 0.95;
        }
        return total;
    }
}
