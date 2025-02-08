package com.aprendizado.java.POO.dominio.SistemaBancario;

public class TestSistemaBancaria {
    public static void main(String[] args) {
        Banco bancoDoBrasil = new Banco();
        Conta conta1 = new Conta("Glaudencio", "895589", 9000);
        Conta conta2 = new Conta("Carlos Braga", "895579", 8000);
        Conta conta3 = new Conta("Raimundo Neto", "894589", 7000);
        Conta conta4 = new Conta("Ranji Abarai", "995589", 5000);

        bancoDoBrasil.adicionarConta(conta1);
        bancoDoBrasil.adicionarConta(conta2);
        bancoDoBrasil.adicionarConta(conta3);
        bancoDoBrasil.adicionarConta(conta4);

        Conta conta = bancoDoBrasil.buscarConta("895579");
        if (conta == null) {
            System.out.println("Conta não encontrada!");
        }else{
            conta.dadosConta();
        }

        bancoDoBrasil.removerConta("995589");
        bancoDoBrasil.exibirTodasAsContas();

        conta1.transferir(2000, conta2);
        conta1.depositar(3000);
        conta1.sacar(1000);
    }
}
