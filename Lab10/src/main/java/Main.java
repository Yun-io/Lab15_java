class Main {
    public static void main(String[] args) {
        Wearable[] clothes = {
                new Jacket("Nike", "L", "Polyester"),
                new Jacket("Columbia", "XL", "Gore-Tex"),
                new Jacket("Zara", "M", "Cotton"),
                new TShirt("Adidas", "M", "Red"),
                new TShirt("Puma", "S", "White")
        };

        for (Wearable item : clothes) {
            item.wear();
            ((Washable) item).wash();
        }
    }
}