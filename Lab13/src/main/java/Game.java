public class Game {
    private String title;
    private String genre;
    private double rating;
    private double price;
    private int releaseYear;

    public Game(String title, String genre, double rating, double price, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(double rating) throws InvalidGameDataException {
        this.rating = rating;
        if (rating < 1 || rating > 10) {
            throw new InvalidGameDataException("Рейтинг должен быть от 1 до 10");
        }
    }

    public void setPrice(double price) throws InvalidGameDataException {
        this.price = price;
        if (price < 0) {
            throw new InvalidGameDataException("Цена не может быть отрицательной");
        }
    }

    public double getPrice() {
        return price;
    }

    public void purchase() throws PurchaseException {
        if (this.price > 10000) {
            throw new PurchaseException("Превышен лимит стоимости покупки игры: " + title);
        }
        System.out.println("Игра " + title + " успешно куплена.");
    }

    public void updatePrice(double newPrice) throws InvalidGameDataException {
        if (newPrice < 0) {
            throw new InvalidGameDataException("Новая цена не может быть отрицательной");
        }
        this.price = newPrice;
        System.out.println("Цена игры " + title + " обновлена до: " + newPrice);
    }
}