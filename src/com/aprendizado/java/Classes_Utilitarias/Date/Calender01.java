package com.aprendizado.java.Classes_Utilitarias.Date;

import java.util.Calendar;
import java.util.Date;

public class Calender01 {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        System.out.println("Data atual: " + calender.getTime());

        calender.set(2025, Calendar.MAY, 2);
        System.out.println("Dia dois de maio: " + calender.getTime());

        int ano = calender.get(Calendar.YEAR);
        int mes = calender.get(Calendar.MONTH);
        int diaDoMes = calender.get(Calendar.DAY_OF_MONTH);
        int diaDaSemana = calender.get(Calendar.DAY_OF_WEEK);

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Dia do Mês: " + diaDoMes);
        System.out.println("Dia da Semana: " + diaDaSemana);

        calender.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println("Data após adicionar 7 dias: " + calender.getTime());

        Date data = calender.getTime();
        System.out.println("Objeto Date correspondente: " + data);
    }
}
