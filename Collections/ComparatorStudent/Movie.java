package ComparatorStudent;//import java.util.*;

public class Movie {
    public Movie(String name, int ratings, int noOfRatings) {
        this.name = name;
        this.ratings = ratings;
        this.noOfRatings = noOfRatings;
    }

    private String name;
    private int ratings;
    private int noOfRatings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getNoOfRatings() {
        return noOfRatings;
    }

    public void setNoOfRatings(int noOfRatings) {
        this.noOfRatings = noOfRatings;
    }



}
