package be.intecbrussels.the_notebook.entities.PLANT_ENTITIES;

public class Weed extends Plant{
    private double area;

    public Weed(String name) {
        super(name);
        this.area = area;
    }

    public Weed(String name, double height) {
        super(name, height);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
