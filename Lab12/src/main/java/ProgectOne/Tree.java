package ProgectOne;


class Tree extends Plant {
    double crownDiameter;

    public Tree(String name, int id, double height, double crownDiameter) {
        super(name, id, height);
        this.crownDiameter = crownDiameter;
    }
}
