class Jacket implements Wearable, Washable {
    private String brand;
    private String size;
    private String material;

    public Jacket(String brand, String size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    @Override
    public void wear() {
        System.out.println("Куртка " + brand + " надета.");
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void wash() {
        System.out.println("Куртка " + brand + " постирана.");
    }

    @Override
    public String getMaterial() {
        return material;
    }
}