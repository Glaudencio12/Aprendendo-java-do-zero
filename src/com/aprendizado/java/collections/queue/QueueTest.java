package com.aprendizado.java.collections.queue;

import com.aprendizado.java.collections.list.dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(Comparator.comparing(Manga::getId)); //LinkedList, ArrayDeque

        mangas.offer(new Manga(2L,"Dragon Ball Z", 20.0));
        mangas.offer(new Manga(4L,"Attack On Titan", 50.0));
        mangas.offer(new Manga(6L,"Jujutsu Kaisen", 10.0));
        mangas.offer(new Manga(1L,"Chainsawn man", 24.0));
        mangas.offer(new Manga(3L,"Demon Slayer", 22.0));
        mangas.offer(new Manga(5L,"Re:Zero", 20.0));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-".repeat(40));

        System.out.println("=====Prioridade de remoção======");
        for (Manga manga : mangas) {
            if (!mangas.isEmpty()) {
                System.out.println(manga);
            }
        }
    }
}
