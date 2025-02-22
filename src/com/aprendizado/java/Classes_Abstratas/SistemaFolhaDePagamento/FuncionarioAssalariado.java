package com.aprendizado.java.Classes_Abstratas.SistemaFolhaDePagamento;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioBase;

    public FuncionarioAssalariado(String nome, int id, double salarioBase) {
        super(nome, id);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
