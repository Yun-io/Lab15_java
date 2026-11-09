public class Jacket extends Clothing {
    private String material;

    public Jacket(String brand, String size, String color, String material) {
        super(brand, size, color);
        this.material = material;
    }

    @Override
    public String getSeason() {
        return "Зима";
    }

    public void zipUp() {
        System.out.println("Застегнута");
    }

    public void zipUp(boolean hoodOn) {
        System.out.println("Капюшон: " + hoodOn);
    }
}
