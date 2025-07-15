package com.aprendizado.java.Classes_Utilitarias.Date;

import java.time.*;

public class   DurationTest {
    public static void main(String[] args) {
        System.out.println("Usando duration:");

        LocalTime agora = LocalTime.now();
        LocalTime futuro = agora.plusHours(5);

        Duration d1 = Duration.between(agora, futuro);
        System.out.println("Intervalo: " + d1);
        System.out.println("Em minutos: " + d1.toMinutes());
        System.out.println("Em segundos: " + d1.toSeconds());
        System.out.println("Em nanosegundos: " + d1.toNanos());

        System.out.println("Usando period:");

        LocalDate agoraDate = LocalDate.now();
        LocalDate futuroDate = agoraDate.plusWeeks(3);

        Period p1 = Period.between(agoraDate, futuroDate);
        System.out.println("Intervalo: " + p1);
        System.out.println("Em meses: " + p1.toTotalMonths());
    }
}
