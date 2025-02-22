package com.aprendizado.java.Classes_Abstratas.SistemaFolhaDePagamento;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();

        FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("Glaudencio", 1, 3000);
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Raimundo", 2, 1200, 20);
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Carlos", 3, 40, 20);

        folha.addFuncionario(funcionarioAssalariado, funcionarioComissionado, funcionarioHorista);
        folha.exibirFolha();
        System.out.println("=".repeat(40));
        System.out.println("Folha de pagamento total: " + folha.calcularFolhaTotal() + "R$");
        System.out.println("=".repeat(40));
    }
}
