package com.aprendizado.java.POO.dominio.SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void removerConta(String numero){
        contas.removeIf(conta -> conta.getNumero().equals(numero));
    }

    public Conta buscarConta(String numero){
        for (Conta conta : contas){
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public void exibirTodasAsContas(){
        for (Conta conta : contas){
            conta.dadosConta();
            System.out.println("-".repeat(50));
        }
    }
}
