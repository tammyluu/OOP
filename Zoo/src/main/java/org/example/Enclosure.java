package org.example;

import java.util.List;

public class Enclosure {
    private  int id;
    private  String name;
    private List<Animal> animals ;
    public Enclosure(int id, String name, List<Animal> animals) {
        this.id = id;
        this.name = name;
        this.animals = animals;
    }
    public int getId() {
        return id;
    }
    public  String getName() {
        return name;
    }
    public  List<Animal> getAnimals() {
        return animals;
    }
    public  void getAnimal(Animal animal) {
        animals.add(animal);
    }
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

}
