package be.intecbrussels.the_notebook.entities.PLANT_ENTITIES;

public class Flower extends Plant{
    private Scent smell;

    public Flower(String name) {
        super(name);
        this.smell = smell;
    }

    public Flower(String name, double height) {
        super(name, height);
        this.smell = smell;
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "smell=" + smell +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
