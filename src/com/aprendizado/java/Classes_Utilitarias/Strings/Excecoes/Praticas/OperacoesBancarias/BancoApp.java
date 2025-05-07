package com.aprendizado.java.Classes_Utilitarias.Strings.Excecoes.Praticas.OperacoesBancarias;

public class BancoApp {
    public static void main(String[] args) throws SaldoInsuficienteException{
        ContaBancaria conta = new ContaBancaria();
        try {
            conta.depositar(1000);
            conta.sacar(-1);
        }catch (ValorInvalidoException e){
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }catch (SaldoInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Operção ou tentativa realizada e finalizada com sucesso");
        }
        System.out.println("Saldo em conta: " + conta.consultarSaldo());
    }
}
