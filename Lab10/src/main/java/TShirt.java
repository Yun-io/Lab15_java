class TShirt implements Wearable, Washable {
    private String brand;
    private String size;
    private String color;

    public TShirt(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public void wear() {
        System.out.println("Футболка " + brand + " надета.");
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void wash() {
        System.out.println("Футболка " + brand + " постирана.");
    }

    @Override
    public String getMaterial() {
        return "Cotton";
    }
}
