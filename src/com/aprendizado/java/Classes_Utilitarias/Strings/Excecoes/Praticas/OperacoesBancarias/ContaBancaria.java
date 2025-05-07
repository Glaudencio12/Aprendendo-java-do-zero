package com.aprendizado.java.Classes_Utilitarias.Strings.Excecoes.Praticas.OperacoesBancarias;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(){}
    public ContaBancaria(String numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if (valor < 0) {
            throw new ValorInvalidoException("Valor negativo para deeposito");
        }else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor < 0) {
            throw new ValorInvalidoException("Valor negativo para saque");
        } else if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }else{
            this.saldo -= valor;
        }
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
