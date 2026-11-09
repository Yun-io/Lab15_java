package ProgectTwo;
import java.util.List;

class Cafe {
    private int id;
    private String name;
    private String location;
    private int rating;
    private List<Integer> visitorReviews;

    public Cafe(int id, String name, String location, int rating, List<Integer> visitorReviews) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.visitorReviews = visitorReviews;
    }

    public double getAverageReview() {
        if (visitorReviews == null || visitorReviews.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int review : visitorReviews) {
            sum += review;
        }
        return sum / visitorReviews.size();
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + name + getAverageReview();
    }
}
