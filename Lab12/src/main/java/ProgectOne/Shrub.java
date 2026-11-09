package ProgectOne;

class Shrub extends Plant {
    int branchCount;

    public Shrub(String name, int id, double height, int branchCount) {
        super(name, id, height);
        this.branchCount = branchCount;
    }
}
