package com.aprendizado.java.Classes_Abstratas.SistemaLocadora;

public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        Economico economico = new Economico("ABC-1234", "Fiat Uno", 80.00, CategoriaVeiculo.ECONOMICO);
        SUV suv = new SUV("BCD-123", "Jepp compass", 100.00, CategoriaVeiculo.SUV);
        Luxo luxo = new Luxo("JDF-393", "BMW-V5", 200.00, CategoriaVeiculo.LUXO);
        Sedan sedan = new Sedan("LKD-848", "Pajero-j6", 200.00, CategoriaVeiculo.SEDAN);

        locadora.adicionarVeiculos(suv, luxo, sedan, economico);
        System.out.println("=".repeat(40));
        System.out.println("Aluguel de um veículo SUV por 30 dias: " + suv.calcularAluguel(30));
        System.out.println("Aluguel de um veículo Economico por 30 dias: " + economico.calcularAluguel(30));
        System.out.println("Aluguel de um veículo Sedan por 30 dias: " + sedan.calcularAluguel(30));
        System.out.println("Aluguel de um veículo Luxo por 30 dias: " + luxo.calcularAluguel(30));
        System.out.println("=".repeat(40));

        locadora.listarVeiculos();
    }
}
