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

        Bush bush1 = new Bush("Broom", 6);
        bush1.setLeafType(LeafType.ROUND);
        Bush bush2 = new Bush("Rhododendron", 4);

        Flower flower1 = new Flower("Calla Lily", 2);
        flower1.setSmell(Scent.SWEET);
        Tree tree1 = new Tree("Larix decidua", 25);
        tree1.setLeafType(LeafType.HAND);
        Weed weed1 = new Weed("Cannabis", 1.5);
        weed1.setArea(1000);


        Carnivore carnivore1 = new Carnivore("Lion", 150, 1.5, 3);
        carnivore1.setMaxFoodSize(20);
        Carnivore carnivore2 = new Carnivore("Grey Wolf", 40, 0.7, 1.6);
        carnivore2.setMaxFoodSize(8);
        Carnivore carnivore3 = new Carnivore("Falcon", 18, 0.5, 1);
        carnivore3.setMaxFoodSize(5);

        Omnivore omnivore1 = new Omnivore("Opossum", 5.5, 0.3, 0.8);
        omnivore1.setPlantDiet(new HashSet<>());
        omnivore1.addPlantToDiet(weed1);
        Omnivore omnivore2 = new Omnivore("Hamster", 1.2, 0.1, 0.3);
        omnivore2.addPlantToDiet(bush1);
        Omnivore omnivore3 = new Omnivore("Raccoon", 7, 2, 1.2);
        omnivore3.addPlantToDiet(flower1);

        Herbivore herbivore1 = new Herbivore("Cow", 120, 0.7, 1.5);
        herbivore1.addPlantToDiet(flower1);
        Herbivore herbivore2 = new Herbivore("Elephant", 6000, 3, 5.5);
        herbivore2.addPlantToDiet(tree1);
        Herbivore herbivore3 = new Herbivore("Deer", 67, 1.4, 2.2);
        herbivore3.addPlantToDiet(weed1);

        ForestNotebook forestNotebook = new ForestNotebook();

        forestNotebook.addPlant(bush1);
        forestNotebook.addPlant(bush2);
        forestNotebook.addPlant(flower1);
        forestNotebook.addPlant(tree1);
        forestNotebook.addPlant(weed1);
        forestNotebook.addPlant(weed1);
        forestNotebook.addPlant(weed1);

        System.out.println(forestNotebook.getPlantCount());

        System.out.println("------------1-------------");


        forestNotebook.addAnimal(carnivore1);
        forestNotebook.addAnimal(carnivore2);
        forestNotebook.addAnimal(carnivore2);
        forestNotebook.addAnimal(carnivore3);
        forestNotebook.addAnimal(herbivore1);
        forestNotebook.addAnimal(herbivore2);
        forestNotebook.addAnimal(herbivore3);
        forestNotebook.addAnimal(herbivore3);
        forestNotebook.addAnimal(omnivore1);
        forestNotebook.addAnimal(omnivore1);
        forestNotebook.addAnimal(omnivore2);
        forestNotebook.addAnimal(omnivore3);
        System.out.println(forestNotebook.getCarnivores());
        System.out.println(forestNotebook.getAnimalCount());

        List<Plant> plantList = new ArrayList<>();
        plantList.add(bush1);
        plantList.add(bush2);
        plantList.add(flower1);
        plantList.add(tree1);
        plantList.add(weed1);

        System.out.println(plantList.size());

        forestNotebook.printNotebook();
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











    }
}
