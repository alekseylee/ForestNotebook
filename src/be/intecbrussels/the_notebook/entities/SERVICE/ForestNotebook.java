package be.intecbrussels.the_notebook.entities.SERVICE;

import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Animal;
import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Carnivore;
import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Herbivore;
import be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES.Omnivore;
import be.intecbrussels.the_notebook.entities.PLANT_ENTITIES.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {
    private List<Carnivore> carnivores = new ArrayList<>();


    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();

    private List<Plant> plants = new ArrayList<>();

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plants.size();
    }

    public int getAnimalCount() {
        return animals.size();
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);

            animalCount++;

            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            } else if (animal instanceof Omnivore) {
                omnivores.add((Omnivore) animal);
            } else if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            }
        }
    }


    public void addPlant(Plant plant) {
        if (!plants.contains(plant)) {
            plants.add(plant);
            plantCount += 1;
        }
    }


    public void printNotebook() {
        System.out.println("List of animals: ");
        animals.forEach(animal -> System.out.println(animal));
        System.out.println("List of plants: ");
        plants.forEach(plant -> System.out.println(plants));
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
        System.out.println(animals);
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
        System.out.println(plants);
    }

    @Override
    public String toString() {
        return "ForestNotebook{" +
                "carnivores=" + carnivores +
                ", omnivores=" + omnivores +
                ", herbivores=" + herbivores +
                ", plantCount=" + plantCount +
                ", animalCount=" + animalCount +
                ", animals=" + animals +
                ", plants=" + plants +
                '}';
    }
}
