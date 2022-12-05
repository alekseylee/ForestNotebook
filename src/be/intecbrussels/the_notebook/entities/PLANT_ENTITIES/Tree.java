package be.intecbrussels.the_notebook.entities.PLANT_ENTITIES;

public class Tree extends Plant{
    private LeafType leafType;

    public Tree(String name) {
        super(name);
        this.leafType = leafType;
    }

    public Tree(String name, double height) {
        super(name, height);
        this.leafType = leafType;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }


    @Override
    public String toString() {
        return "Tree{" +
                super.toString() +
                "leafType=" + leafType +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
