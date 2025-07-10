package com.aprendizado.java.Classes_Utilitarias.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Data local: " + dateTime);
        System.out.println("Local Date do date time: " + dateTime.toLocalDate());
        System.out.println("Local Time do date time: " + dateTime.toLocalTime());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatted = dateTime.format(formatter);
        System.out.println("Data formatada: " + formatted);
    }
}
