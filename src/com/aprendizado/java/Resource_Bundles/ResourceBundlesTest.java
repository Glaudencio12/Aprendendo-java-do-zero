package com.aprendizado.java.Resource_Bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlesTest {
    public static void main(String[] args) {
        Locale locale1 = Locale.of("pt", "BR");
        ResourceBundle mensagens1 = ResourceBundle.getBundle("mensagens", locale1);

        System.out.println(mensagens1.getString("saudation.morning"));
        System.out.println(mensagens1.getString("saudation.afternoon"));
        System.out.println(mensagens1.getString("saudation.night"));
        System.out.println(mensagens1.getString("saudation.bye"));

        System.out.println("-".repeat(40));

        Locale locale2 = Locale.of("en", "US");
        ResourceBundle mensagens2 = ResourceBundle.getBundle("mensagens", locale2);

        System.out.println(mensagens2.getString("saudation.morning"));
        System.out.println(mensagens2.getString("saudation.afternoon"));
        System.out.println(mensagens2.getString("saudation.night"));
        System.out.println(mensagens2.getString("saudation.bye"));
    }
}
