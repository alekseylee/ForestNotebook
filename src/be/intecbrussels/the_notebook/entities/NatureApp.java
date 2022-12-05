package be.intecbrussels.the_notebook.entities;

import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Animal;
import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Carnivore;
import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Herbivore;
import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Omnivore;
import be.intecbrussels.the_notebook.entities.PLANT_ENTITIES.*;
import be.intecbrussels.the_notebook.entities.SERVICE.ForestNotebook;

import java.util.*;


public class NatureApp {
    public static void main(String[] args) {

//        List<Plant> plantList = new ArrayList<>();
//        plantList.add(new Bush("Broom", 6));
//        plantList.add(new Bush("Rhododendron", 4));
//        plantList.add(new Flower("Calla Lily", 2));
//        plantList.add(new Tree("Larix decidua", 25));
//        plantList.add(new Weed("Cannabis", 1.5));
//
//        System.out.println(plantList.size());
//
//        List<Animal> carnivores = new ArrayList<>();
//        carnivores.add(new Carnivore("Lion", 150, 1.5, 3));
//        carnivores.add(new Carnivore("Grey Wolf", 40, 0.7, 1.6));
//        carnivores.add(new Carnivore("Falcon", 18, 0.5, 1));
//        System.out.println("Total carnivores animals: " +carnivores.size());
//
//        List<Animal> omnivores = new ArrayList<>();
//        omnivores.add(new Omnivore("Opossum", 5.5, 0.3, 0.8));
//        omnivores.add(new Omnivore("Hamster", 1.2, 0.1, 0.3));
//        omnivores.add(new Omnivore("Raccoon", 7, 2, 1.2));
//        System.out.println("Total omnivores animals: " +omnivores.size());
//
//        List<Animal> herbivores = new ArrayList<>();
//        herbivores.add(new Herbivore("Cow", 120, 0.7, 1.5));
//        herbivores.add(new Herbivore("Elephant", 6000, 3, 5.5));
//        herbivores.add(new Herbivore("Deer", 67, 1.4, 2.2));
//        System.out.println("Total herbivores animals: " +herbivores.size());
//
//        List<Animal> animalList = new ArrayList<>();
//        animalList.addAll(carnivores);
//        animalList.addAll(omnivores);
//        animalList.addAll(herbivores);
//
//        System.out.println(animalList.size());

        ForestNotebook forestNotebook = new ForestNotebook();

        forestNotebook.addPlant(new Bush("Broom", 6));
        forestNotebook.addPlant(new Bush("Rhododendron", 4));
        forestNotebook.addPlant(new Flower("Calla Lily", 2));
        forestNotebook.addPlant(new Tree("Larix decidua", 25));
        forestNotebook.addPlant(new Weed("Cannabis", 1.5));
        forestNotebook.addPlant(new Weed("Cannabis", 1.5));
        System.out.println(forestNotebook.getPlantCount());












    }
}
