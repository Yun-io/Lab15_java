public class Clothing {
    public String brand;
    private String size;
    private String color;

    public Clothing(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeason() {
        return "Любой сезон";
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand + ", Размер: " + size + ", Цвет: " + color + ", Сезон: " + getSeason());
    }

    public static void main(String[] args) {
        Jacket jacket1 = new Jacket("Nike", "L", "Черный", "Кожа");
        Jacket jacket2 = new Jacket("Adidas", "M", "Синий", "Полиэстер");
        Jacket jacket3 = new Jacket("Zara", "XL", "Серый", "Шерсть");

        TShirt tshirt1 = new TShirt("Puma", "S", "Белый", "Логотип");
        TShirt tshirt2 = new TShirt("Gucci", "M", "Красный", "Надпись");

        jacket1.zipUp();
        tshirt1.iron();
        System.out.println();

        Clothing[] clothes = new Clothing[5];
        clothes[0] = jacket1;
        clothes[1] = jacket2;
        clothes[2] = jacket3;
        clothes[3] = tshirt1;
        clothes[4] = tshirt2;

        for (Clothing item : clothes) {
            item.displayInfo();
        }
    }
}
