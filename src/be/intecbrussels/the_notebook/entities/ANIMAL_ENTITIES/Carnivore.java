package be.intecbrussels.the_notebook.entities.ANIMAL_ENTITIES;

public class Carnivore extends Animal{
    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
        this.maxFoodSize = maxFoodSize;
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.maxFoodSize = maxFoodSize;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
