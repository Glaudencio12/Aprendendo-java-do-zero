package com.aprendizado.java.collections.list.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayForList {
    public static void main(String[] args) {
        System.out.println("Conversão de lista para array:");
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(3);
        numeros1.add(6);
        numeros1.add(5);
        System.out.println("List: " + numeros1);

        var array = numeros1.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Conversão de array para lista:");
        Integer[] numeros2 = new Integer[4];
        numeros2[0] = 1;
        numeros2[1] = 2;
        numeros2[2] = 5;
        numeros2[3] = 4;
        System.out.println("Array:" + Arrays.toString(numeros2));

        // Cria uma lista fixa vinculada ao array original.
        // Alterações na lista refletem no array, e não é possível adicionar ou remover elementos da lista.
        // Exemplo:
        // var list = Arrays.asList(numeros2);
        // list.add(3); // lança UnsupportedOperationException

        // Cria uma nova lista independente do array original.
        // Alterações na lista não afetam o array, e pode adicionar ou remover elementos livremente.
        List<Integer> list = new ArrayList<>(Arrays.asList(numeros2));
        list.add(34);
        System.out.println("List: " + list);

    }
}
