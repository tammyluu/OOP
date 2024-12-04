package org.example;

import java.util.ArrayList;

public class ConsoleMenu {
    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();

        // Ajouter quelques enclos pour tester
        zooManager.addEnclosure(new Enclosure(1, "Savane", new ArrayList<>()));
        zooManager.addEnclosure(new Enclosure(2, "Jungle", new ArrayList<>()));

        // Lancer le menu interactif
        zooManager.interactWithMenu();
    }
}