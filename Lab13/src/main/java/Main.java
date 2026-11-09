import java.util.ArrayList;
import java.util.List;


public class Main {
    private static List<Game> shop = new ArrayList<>();

    public static Game findGame(String title) throws GameNotFoundException {
        for (Game game : shop) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return game;
            }
        }
        throw new GameNotFoundException("Игра не найдена: " + title);
    }

    public static void main(String[] args) {

            shop.add(new Game("The Witcher 3", "RPG", 9.8, 1500, 2015));
            shop.add(new Game("Cyberpunk 2077", "RPG", 8.5, 2000, 2020));
            shop.add(new Game("Overpriced Game", "Sim", 5.0, 15000, 2024));
            new Game("Broken Game", "Action", 12.0, 500, 2023);

        try {
            Game game = findGame("The Witcher ");
            game.purchase();
        } catch (GameNotFoundException | PurchaseException e) {
            System.err.println(e.getMessage());
        }

        try {
            Game game = findGame("Overpriced Game");
            game.purchase();
        } catch (GameNotFoundException | PurchaseException e) {
            System.out.println(": " + e.getMessage());
        }

        try {
            Game game = findGame("Non-Existent Game");
            game.purchase();
        } catch (GameNotFoundException | PurchaseException e) {
            System.out.println(": " + e.getMessage());
        }

        try {
            Game game = findGame("Cyberpunk 2077");
            game.updatePrice(-500);
        } catch (GameNotFoundException | InvalidGameDataException e) {
            System.out.println(": " + e.getMessage());
        }
    }
}