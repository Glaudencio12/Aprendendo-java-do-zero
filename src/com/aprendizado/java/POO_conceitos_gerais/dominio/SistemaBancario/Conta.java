package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaBancario;

public class Conta {
    private String titular;
    private String numero;
    private double saldo;

    public Conta(String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque");
        }else{
            this.saldo -= valor;
            System.out.println("-".repeat(50));
            System.out.println("Saque no valor de " + valor + " realizado com sucesso!");
        }
    }

    public void transferir(double valor, Conta conta){
        conta.saldo += valor;
        this.saldo -= valor;
        System.out.println("-".repeat(50));
        System.out.println("Tranferência para " + conta.titular + " no valor de " + valor + " R$Realizada com sucesso");
    }

    public void dadosConta() {
        System.out.println("-".repeat(50));
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
