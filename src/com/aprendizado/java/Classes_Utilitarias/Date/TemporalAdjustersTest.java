package com.aprendizado.java.Classes_Utilitarias.Date;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(now.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(now.with(TemporalAdjusters.firstDayOfYear()));
        System.out.println(now.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.println(now.with(TemporalAdjusters.next(now.getDayOfWeek())));
        System.out.println(now.with(TemporalAdjusters.previous(now.getDayOfWeek())));

    }
}
