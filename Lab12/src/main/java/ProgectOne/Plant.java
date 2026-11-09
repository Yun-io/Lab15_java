package ProgectOne;

class Plant {
    String name;
    int id;
    double height;

    public Plant(String name, int id, double height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + id + height;
    }
}
