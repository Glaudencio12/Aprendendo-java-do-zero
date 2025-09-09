package com.aprendizado.java.collections.map.testes;

import com.aprendizado.java.collections.list.dominio.Manga;
import com.aprendizado.java.collections.map.dominio.Comprador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompradorTest {
    public static void main(String[] args) {
        Map<Comprador, List<Manga>> map = new HashMap<>();

        Comprador comprador1 = new Comprador("Glaudencio");
        Comprador comprador2 = new Comprador("Raimundo");

        Manga dragonBallZ = new Manga(2L, "Dragon Ball Z", 20.0);
        Manga attackOnTitan = new Manga(4L, "Attack On Titan", 50.0);
        Manga jujutsuKaisen = new Manga(6L, "Jujutsu Kaisen", 10.0);
        Manga chainsawnMan = new Manga(1L, "Chainsawn man", 24.0);

        List<Manga> mangasConsumidor1 = List.of(dragonBallZ, attackOnTitan);
        List<Manga> mangasConsumidor2 = List.of(jujutsuKaisen, chainsawnMan);

        map.put(comprador1, mangasConsumidor1);
        map.put(comprador2, mangasConsumidor2);


        for (Map.Entry<Comprador, List<Manga>> entry : map.entrySet()) {
            System.out.print(entry.getKey().getNome() + ": ");
            for (Manga manga : entry.getValue()){
                System.out.print(manga.getNome() + ", ");
            }
            System.out.println("\n");
        }
    }
}
