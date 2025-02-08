package com.aprendizado.java.Classes_Enums.DiasDaSemana;

public class TesteDiaHoje {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SABADO;

        if (dia == DiaSemana.DOMINGO || dia == DiaSemana.SABADO) {
            System.out.println("Fim de semana, descançar que não é de ferro");
        } else {
            System.out.println("Trabalhar vagabundo");
        }

        System.out.println("ENUMS: ");
        for (DiaSemana dia1 : DiaSemana.values()){
            System.out.println(dia1);
        }
    }
}