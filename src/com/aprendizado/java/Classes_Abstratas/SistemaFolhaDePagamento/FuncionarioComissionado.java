package com.aprendizado.java.Classes_Abstratas.SistemaFolhaDePagamento;

public class FuncionarioComissionado extends Funcionario{
    private double vendas;
    private double comissao;

    public FuncionarioComissionado(String nome, int id, double vendas, double comissao) {
        super(nome, id);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return vendas * comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
