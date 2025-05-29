package com.aprendizado.java.Classes_Utilitarias.Strings;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello World!");
        System.out.println(stringBuilder.append(" Glaudencio"));
        System.out.println(stringBuilder.insert(1, " ABDC "));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.delete(0, 5));
        //Vários outros mais
    }
}
