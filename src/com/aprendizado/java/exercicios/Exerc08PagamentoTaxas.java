package com.aprendizado.java.exercicios;

public class Exerc08PagamentoTaxas {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double tarifa1 = 9.70 / 100;
        double tarifa2 = 37.35 / 100;
        double tarifa3 = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * tarifa1;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * tarifa2;
        }else{
            valorImposto = salarioAnual * tarifa3;
        }
        System.out.println(valorImposto);
    }
}
