package com.aprendizado.java.Classes_Utilitarias.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormat01 {
    public static void main(String[] args) {
       localeDate();
    }

    public static void localeDate(){
        Locale localeJapao = new Locale(Locale.JAPANESE.getLanguage(), Locale.JAPAN.getCountry());
        Locale localeChina = new Locale(Locale.CHINESE.getLanguage(), Locale.CHINA.getCountry());
        Locale localeCoreia = new Locale(Locale.KOREAN.getLanguage(), Locale.KOREA.getCountry());

        Calendar calendar = Calendar.getInstance();

        DateFormat dtf1 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dtf2 = DateFormat.getDateInstance(DateFormat.FULL, localeChina);
        DateFormat dtf3 = DateFormat.getDateInstance(DateFormat.FULL, localeCoreia);

        System.out.printf("Japão: %s%n", dtf1.format(calendar.getTime()));
        System.out.printf("China: %s%n", dtf2.format(calendar.getTime()));
        System.out.printf("Coreia: %s%n", dtf3.format(calendar.getTime()));
    }

    public static void parseDateForString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy  HH'h':mm'min':ss's'");
        Date date = new Date();

        String dataFormatada = sdf.format(date);
        System.out.printf("Date convertida para String: %s%n", dataFormatada);
    }

    public static void parseStringForDate(){
        String dataString = "15/08/2023 10:30:00";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try {
            Date dataConvertida = sdf.parse(dataString);
            System.out.println("String convertida para Date: " + dataConvertida);
        } catch (ParseException e) {
            System.err.println("Erro ao analisar a data: " + e.getMessage());
        }

        String dataInvalida = "23/04/2024";
        try {
            sdf.parse(dataInvalida);
        }catch (ParseException e){
            System.err.println("Erro ao analisar a data: " + e.getMessage());
        }
    }

    public static void dateFormat(){
        Calendar date = Calendar.getInstance()  ;
        java.text.DateFormat[] dtf = new java.text.DateFormat[8];
        dtf[0] = java.text.DateFormat.getInstance();
        dtf[1] = java.text.DateFormat.getTimeInstance();
        dtf[2] = java.text.DateFormat.getDateInstance();
        dtf[3] = java.text.DateFormat.getDateTimeInstance();
        dtf[4] = java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT);
        dtf[5] = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);
        dtf[6] = java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG);
        dtf[7] = java.text.DateFormat.getDateInstance(java.text.DateFormat.FULL);

        for (java.text.DateFormat dateF : dtf){
            System.out.println(dateF.format(date.getTime()));
        }
    }
}
