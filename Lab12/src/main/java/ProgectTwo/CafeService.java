package ProgectTwo;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class CafeService {
    public static void printCafes(List<Cafe> cafes, int rating) {
        Iterator<Cafe> iterator = cafes.iterator();
        while (iterator.hasNext()) {
            Cafe cafe = iterator.next();
            if (cafe.getRating() == rating) {
                System.out.println(cafe);
            }
        }
    }

    public static void sortCafes(List<Cafe> cafes) {
        cafes.sort(Comparator.comparingDouble(Cafe::getAverageReview).thenComparing(Cafe::getName).reversed());
    }
}
