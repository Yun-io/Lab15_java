public class TShirt extends Clothing {
    private boolean hasPrint;

    public TShirt(String brand, String size, String color, boolean hasPrint) {
        super(brand, size, color);
        this.hasPrint = hasPrint;
    }

    @Override
    public String getSeason() {
        return "Лето";
    }

    public void iron() {
        System.out.println("Поглажена");
    }

    public void iron(int temp) {
        System.out.println("Утюг: " + temp + "°C");
    }
}
