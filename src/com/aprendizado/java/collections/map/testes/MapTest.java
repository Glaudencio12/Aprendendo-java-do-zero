package com.aprendizado.java.collections.map.testes;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Glaudencio", 19);
        map.put("Maria", 16);
        map.put("José", 18);

        System.out.println("Chaves do map: ");
        for(String nome : map.keySet()){
            System.out.println(nome);
        }

        System.out.println("\nChaves e valores do map: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
