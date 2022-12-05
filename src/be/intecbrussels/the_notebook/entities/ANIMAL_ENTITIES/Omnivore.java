package be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES;

import be.intecbrussels.the_notebook.entities.PLANT_ENTITIES.Plant;

import java.util.Set;

public class Omnivore extends Animal{
    private Set<Plant> plantDiet;
    private double maxFoodSize;


    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.plantDiet = plantDiet;
        this.maxFoodSize = maxFoodSize;
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);

    }

    @Override
    public String toString() {
        return "Omnivore{" +
                super.toString() +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
