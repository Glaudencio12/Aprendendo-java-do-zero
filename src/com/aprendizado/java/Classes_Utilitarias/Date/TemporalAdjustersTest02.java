package com.aprendizado.java.Classes_Utilitarias.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjustersTest02 implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;

        switch (dayOfWeek){
            case THURSDAY -> addDays = 4;
            case FRIDAY -> addDays = 3;
            case SATURDAY -> addDays = 2;
            default -> addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Dia:" + now.getDayOfWeek());
        System.out.println("Próximo dia útil: " + now.plusDays(3).with(new TemporalAdjustersTest02()));
    }
}
