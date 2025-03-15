package com.aprendizado.java.Interfaces.Abrigo_De_Animais;

import java.util.ArrayList;
import java.util.List;

public class Abrigo {
    private List<Animal> listAnimais;

    public Abrigo() {
        this.listAnimais = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        listAnimais.add(animal);
    }

    public void addAnimal(Animal...animais){
        for (Animal animal : animais){
            listAnimais.add(animal);;
        }
    }

    public void listarAnimais(){
        for (Animal animal : listAnimais){
            System.out.println("-".repeat(40));
            animal.exibirInformacoes();
            animal.emitirSom();
            animal.mover();
        }
    }
}
