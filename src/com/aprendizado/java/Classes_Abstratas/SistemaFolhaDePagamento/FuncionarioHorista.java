package com.aprendizado.java.Classes_Abstratas.SistemaFolhaDePagamento;

public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, int id, double horasTrabalhadas, double valorPorHora) {
        super(nome, id);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
