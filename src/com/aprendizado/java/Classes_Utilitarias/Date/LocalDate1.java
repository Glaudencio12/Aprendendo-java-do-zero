package com.aprendizado.java.Classes_Utilitarias.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class LocalDate1 {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalDate date = LocalDate.of(2025, Calendar.FEBRUARY, 3);
        System.out.println("Data especificada: " + date);

        if (date.isAfter(dataAtual)) {
            System.out.println("A data especificada é futura ao dia de hoje");
        } else if (date.isBefore(dataAtual)) {
            System.out.println("Adata especificada é passada ao dia de hoje");
        } else if (date.isEqual(dataAtual)) {
            System.out.println("A data especificada é igual à data de hoje");
        }

        System.out.println("Dia do mês: " + dataAtual.getDayOfMonth());
        System.out.println("Dia do ano: " + dataAtual.getDayOfYear());
        System.out.println("Dia da semana: " + dataAtual.getDayOfWeek());
        System.out.println("Número que repesenta o mês: " + dataAtual.getMonthValue());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(dateTimeFormatter);
        System.out.println("Data formatada estilo Brasil: " + dataFormatada);
    }
}
