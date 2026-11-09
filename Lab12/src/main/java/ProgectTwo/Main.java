package ProgectTwo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cafe> cafes = new ArrayList<>();

        List<Integer> reviews1 = new ArrayList<>();
        reviews1.add(5); reviews1.add(4); reviews1.add(5);
        cafes.add(new Cafe(1, "Арома", "Центр", 3, reviews1));

        List<Integer> reviews2 = new ArrayList<>();
        reviews2.add(2); reviews2.add(2); reviews2.add(3);
        cafes.add(new Cafe(2, "Бриз", "Вокзал", 2, reviews2));

        List<Integer> reviews3 = new ArrayList<>();
        reviews3.add(4); reviews3.add(4); reviews3.add(4);
        cafes.add(new Cafe(3, "Весна", "Парк", 4, reviews3));

        List<Integer> reviews4 = new ArrayList<>();
        reviews4.add(5); reviews4.add(5); reviews4.add(4);
        cafes.add(new Cafe(4, "Дврора", "Окраина", 4, reviews4));

        Iterator<Cafe> iterator = cafes.iterator();
        while (iterator.hasNext()) {
            Cafe cafe = iterator.next();
            if (cafe.getAverageReview() < 3) {
                iterator.remove();
            }
        }

        for (Cafe cafe : cafes) {
            if (cafe.getAverageReview() >= 4) {
                cafe.setRating(cafe.getRating() + 1);
            }
        }

        System.out.println("Печать кафе с рейтингом 5:");
        CafeService.printCafes(cafes, 5);
        System.out.println();

        CafeService.sortCafes(cafes);

        System.out.println("Упорядоченный список кафе:");
        Iterator<Cafe> printIterator = cafes.iterator();
        while (printIterator.hasNext()) {
            System.out.println(printIterator.next());
        }
    }
}
