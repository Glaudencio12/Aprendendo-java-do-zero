package com.aprendizado.java.Classes_Enums.SistemaFuncionariosEmpresa;

public class Funcionario {
    private String nomeFuncionario;
    private Departamento departamento;
    private Cargo cargo;
    private double salario;

    public Funcionario(String nomeFuncionario, Departamento departamento, Cargo cargo, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = calcularSalario();
    }

    public double calcularSalario(){
        if (departamento.equals(Departamento.TI)) {
            return (cargo.getSalario() * (1 + 0.10));
        } else if (cargo.equals(Cargo.GERENTE)) {
            return (cargo.getSalario() * (1 + 0.05));
        }
        return cargo.getSalario();
    }

    @Override
    public String toString() {
        return "Funcionário: " +
                "nome: '" + nomeFuncionario + '\'' +
                "; departamento: " + departamento +
                "; cargo: " + cargo +
                "; salário: " + salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
