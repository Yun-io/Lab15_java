package ProgectOne;

class Flower extends Plant {
    String bloomColor;

    public Flower(String name, int id, double height, String bloomColor) {
        super(name, id, height);
        this.bloomColor = bloomColor;
    }
}
