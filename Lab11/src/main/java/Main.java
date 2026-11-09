public class Main {
    public static void main(String[] args) {
        Clothing cloth = new Clothing("Zara", "L", "Black");
        Jacket jacket = new Jacket("Columbia", "XL", "Blue", "Down");
        TShirt tshirt = new TShirt("Nike", "M", "White", true);

        cloth.wear();
        cloth.wear("party");
        cloth.wear(15);

        jacket.zipUp();
        jacket.zipUp(true);

        Clothing[] wardrobe = { cloth, jacket, tshirt };
        for (Clothing item : wardrobe) {
            System.out.println(item.getSeason());
        }
    }
}
