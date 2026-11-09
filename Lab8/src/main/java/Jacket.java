class Jacket extends Clothing {
    private String material;

    public Jacket(String brand, String size, String color, String material) {
        super(brand, size, color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getSeason() {
        return "Осень/Зима";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(material + super.brand);

    }

    public void zipUp() {
        System.out.println("Куртка застегнута.");
    }

    public static void main(String[] args) {
        Jacket jacket1 = new Jacket("Nike", "L", "Черный", "Кожа");
        jacket1.displayInfo();
    }
}