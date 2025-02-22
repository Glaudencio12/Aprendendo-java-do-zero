package com.aprendizado.java.Classes_Abstratas.SistemaFolhaDePagamento;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {
    private List<Funcionario> listaFuncionarios;

    public FolhaDePagamento(){
        this.listaFuncionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario...funcionarios){
        for (Funcionario funcionario : funcionarios){
            listaFuncionarios.add(funcionario);;
        }
    }

    public double calcularFolhaTotal(){
        double soma = 0;
        for (Funcionario funcionario : listaFuncionarios){
            soma += funcionario.calcularSalario();
        }
        return soma;
    }

    public void exibirFolha(){
        for (Funcionario funcionario : listaFuncionarios){
            System.out.println(funcionario.toString());
        }
    }
}
