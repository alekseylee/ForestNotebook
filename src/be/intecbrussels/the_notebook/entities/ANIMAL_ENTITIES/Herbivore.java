package be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES;

import be.intecbrussels.the_notebook.entities.PLANT_ENTITIES.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal{
    Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.plantDiet = plantDiet;
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet() {
        System.out.println(plantDiet);

    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
