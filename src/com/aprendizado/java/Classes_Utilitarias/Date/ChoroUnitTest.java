package com.aprendizado.java.Classes_Utilitarias.Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChoroUnitTest {
    public static void main(String[] args) {
        LocalDate pastDate = LocalDate.of(2024, 4, 10);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(pastDate, now));
        System.out.println(ChronoUnit.YEARS.between(pastDate, now));
        System.out.println(ChronoUnit.MONTHS.between(pastDate, now));
        System.out.println(ChronoUnit.WEEKS.between(pastDate, now));

        System.out.println(now.plus(3, ChronoUnit.DAYS));
        System.out.println(now.plus(3, ChronoUnit.MONTHS));
        System.out.println(now.plus(3, ChronoUnit.YEARS));

        System.out.println("-".repeat(20));

        LocalTime pastTime = LocalTime.of(00, 00);
        LocalTime nowHour = LocalTime.now();
        System.out.println(ChronoUnit.HOURS.between(pastTime, nowHour));
        System.out.println(ChronoUnit.MINUTES.between(pastTime, nowHour));
        System.out.println(ChronoUnit.SECONDS.between(pastTime, nowHour));
        System.out.println(ChronoUnit.MILLIS.between(pastTime, nowHour));


    }
}
