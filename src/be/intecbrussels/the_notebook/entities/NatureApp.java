package be.intecbrussels.the_notebook.entities;

import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Carnivore;
import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Herbivore;
import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Omnivore;
import be.intecbrussels.the_notebook.entities.PLANT_ENTITIES.*;
import be.intecbrussels.the_notebook.entities.SERVICE.ForestNotebook;

public class NatureApp {
    public static void main(String[] args) {

        Bush bush1 = new Bush("Broom", 6);
        Bush bush2 = new Bush("Rhododendron", 4);
        Flower flower1 = new Flower("Calla Lily", 2);
        Tree tree1 = new Tree("Larix decidua", 25);
        Weed weed1 = new Weed("Cannabis", 1.5);

        Carnivore carnivore1 = new Carnivore("Lion", 150, 1.5, 3);
        Carnivore carnivore2 = new Carnivore("Grey Wolf", 40, 0.7, 1.6);
        Carnivore carnivore3 = new Carnivore("Falcon", 18, 0.5, 1);

        Omnivore omnivore1 = new Omnivore("Opossum", 5.5, 0.3, 0.8);
        Omnivore omnivore2 = new Omnivore("Hamster", 1.2, 0.1, 0.3);
        Omnivore omnivore3 = new Omnivore("Raccoon", 7, 2, 1.2);

        Herbivore herbivore1 = new Herbivore("Cow", 120, 0.7, 1.5);
        Herbivore herbivore2 = new Herbivore("Elephant", 6000, 3, 5.5);
        Herbivore herbivore3 = new Herbivore("Deer", 67, 1.4, 2.2);

        ForestNotebook forestNotebook = new ForestNotebook();

        forestNotebook.addPlant(bush1);
        forestNotebook.addPlant(bush2);
        forestNotebook.addPlant(flower1);
        forestNotebook.addPlant(tree1);
        forestNotebook.addPlant(weed1);
        forestNotebook.addPlant(weed1);
        bush1.setLeafType(LeafType.ROUND);
        flower1.setSmell(Scent.SWEET);
        tree1.setLeafType(LeafType.HAND);
        weed1.setArea(1000);
        bush1.setFruit("BANANA");
        bush1.setLeafType(LeafType.HEART);
        bush2.setFruit("CHERRY");
        bush2.setLeafType(LeafType.SPEAR);

        forestNotebook.addAnimal(carnivore1);
        forestNotebook.addAnimal(carnivore2);
        forestNotebook.addAnimal(carnivore3);
        forestNotebook.addAnimal(herbivore1);
        forestNotebook.addAnimal(herbivore2);
        forestNotebook.addAnimal(herbivore3);
        forestNotebook.addAnimal(omnivore1);
        forestNotebook.addAnimal(omnivore2);
        forestNotebook.addAnimal(omnivore3);
        forestNotebook.addAnimal(omnivore3);
        carnivore1.setMaxFoodSize(12);
        carnivore2.setMaxFoodSize(8);
        carnivore3.setMaxFoodSize(5);
        omnivore1.addPlantToDiet(weed1);
        omnivore2.addPlantToDiet(flower1);
        omnivore3.addPlantToDiet(tree1);
        herbivore1.addPlantToDiet(flower1);
        herbivore2.addPlantToDiet(tree1);
        herbivore3.addPlantToDiet(weed1);

        //1
        forestNotebook.printNotebook();
        System.out.println("**************************************");
        //2
        System.out.println("Total plant noted: ");
        System.out.println(forestNotebook.getPlantCount());
        System.out.println("Total animal noted: ");
        System.out.println(forestNotebook.getAnimalCount());
        System.out.println("**************************************");
        //3
        forestNotebook.sortAnimalsByName();
        System.out.println("---------------------------------------");
        forestNotebook.sortPlantsByName();
        System.out.println("**************************************");
        //4
        System.out.println("Carnivores list: ");
        forestNotebook.getCarnivores();
        System.out.println("Omnivores list: ");
        forestNotebook.getOmnivores();
        System.out.println("Herbivores list: ");
        forestNotebook.getHerbivores();
        System.out.println("**************************************");
        //5
        forestNotebook.printNotebook();
        System.out.println("**************************************");
        //6 extra
        forestNotebook.sortAnimalsByHeight();
        forestNotebook.sortPlantsByHeight();












    }
}
