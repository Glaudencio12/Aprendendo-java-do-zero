package com.aprendizado.java.Classes_Utilitarias.Date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTime2 {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        System.out.println("Horal atual: " + timeNow);

        LocalTime time = LocalTime.of(23, 56, 23);
        System.out.println("Tempo: " + time);
        System.out.println("Hora: " + time.getHour());
        System.out.println("Minutos: " + time.getMinute());
        System.out.println("Segundos: " + time.getSecond());

        System.out.println("Início do dia às: " + LocalTime.MIN);
        System.out.println("Término do dia às: " + LocalTime.MAX);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String datFormatada = timeNow.format(formato);
        System.out.println("Data Formatada: " + datFormatada);
    }
}
