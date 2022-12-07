package be.intecbrussels.the_notebook.entities.PLANT_ENTITIES;

public class Bush extends Plant{
    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
        this.fruit = fruit;
        this.leafType = leafType;
    }

    public Bush(String name, double height) {
        super(name, height);
        this.fruit = fruit;
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
