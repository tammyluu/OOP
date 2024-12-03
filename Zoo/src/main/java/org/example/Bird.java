package org.example;

public class Bird extends Animal {
    public Bird(int id, String name, String species) {
        super(id, name, species);
    }

    @Override
    public String getDetails() {
        return "";
    }

    @Override
    public void eat() {
        System.out.println("Birds eaten");
    }
}
