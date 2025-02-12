package com.aprendizado.java.Classes_Enums.SistemaFuncionariosEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private final String nomeEmpresa;
    private static List<Funcionario> funcionarios;

    static{
        funcionarios = new ArrayList<>();
        Funcionario funcionario1 = new Funcionario("Glaudencio", Departamento.TI, Cargo.ESTAGIARIO, 2000);
        Funcionario funcionario2 = new Funcionario("Raimundo", Departamento.RH, Cargo.ANALISTA, 20000);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
    }

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public static void exibirListaFuncionarios(){
        System.out.println("Lista de funcionários: ");
        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario.toString());
        }
    }
}
