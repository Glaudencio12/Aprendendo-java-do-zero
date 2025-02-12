package com.aprendizado.java.Classes_Enums.SistemaFuncionariosEmpresa;

public enum Cargo {
    GERENTE(20000),
    ANALISTA(10000),
    DESENVOLVEDOR(10500),
    ESTAGIARIO(2000);

    private double salario;

    Cargo(double salario){
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
