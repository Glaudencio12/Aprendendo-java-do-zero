package com.aprendizado.java.collections.set;

import com.aprendizado.java.collections.list.dominio.Manga;

import java.util.*;

public class SetMangas {
    public static void main(String[] args) {
        //Set<Manga> mangaList = new HashSet<>(6); ----> Não prioriza a ordem de inserção dos elementos
        //Set<Manga> mangaList = new LinkedHashSet<>(6); ----> Prioriza a orderm de inserção do elementos
        Set<Manga> mangaList = new TreeSet<>(Comparator.comparing(Manga::getId)); // ----> Compara e ordena os objetos por Id

        mangaList.add(new Manga(2L,"Dragon Ball Z", 20.0));
        mangaList.add(new Manga(4L,"Attack On Titan", 50.0));
        mangaList.add(new Manga(6L,"Jujutsu Kaisen", 10.0));
        mangaList.add(new Manga(1L,"Chainsawn man", 24.0));
        mangaList.add(new Manga(3L,"Demon Slayer", 22.0));
        mangaList.add(new Manga(5L,"Re:Zero", 20.0));
        mangaList.add(new Manga(5L,"Re:Zero", 20.0)); // ----> Tenta inserir um elemeto duplicado, porém o set ignora

        for (Manga manga : mangaList) {
            System.out.println(manga);
        }

        System.out.println("-".repeat(40));

        NavigableSet<Manga> mangaNavigableSet = new TreeSet<>(Comparator.comparing(Manga::getPreco));

        mangaNavigableSet.add(new Manga(2L,"Dragon Ball Z", 20.0));
        mangaNavigableSet.add(new Manga(4L,"Attack On Titan", 50.0));
        mangaNavigableSet.add(new Manga(6L,"Jujutsu Kaisen", 10.0));
        mangaNavigableSet.add(new Manga(1L,"Chainsawn man", 24.0));
        mangaNavigableSet.add(new Manga(3L,"Demon Slayer", 22.0));
        mangaNavigableSet.add(new Manga(5L,"Re:Zero", 21.0));

        Manga manga = new Manga(5L, "Re:Zero", 20.0);

        System.out.println("Manga com o preço menor que " + manga.getPreco() + ": "+ mangaNavigableSet.lower(manga));
        System.out.println("Manga com o preço menor ou igual que " + manga.getPreco() + ": "+ mangaNavigableSet.floor(manga));
        System.out.println("Manga com o preço maior ou igual que " + manga.getPreco() + ": "+ mangaNavigableSet.ceiling(manga));
        System.out.println("Manga com o preço maior que " + manga.getPreco() + ": "+ mangaNavigableSet.higher(manga));

        System.out.println("-".repeat(40));

        System.out.println("Ordenação decrescente:");
        for (Manga manga1 : mangaNavigableSet.descendingSet()) {
            System.out.println(manga1);
        }
    }
}
