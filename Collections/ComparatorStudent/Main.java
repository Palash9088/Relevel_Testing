package ComparatorStudent;//import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<Movie>();

        Movie movie1 = new Movie("Radhe Shyam", 4, 1100);
        Movie movie2 = new Movie("KGF3", 5, 1700);
        Movie movie3 = new Movie("Dr. Strange in the Multiverse of the Madness", 4, 1200);
        Movie movie4 = new Movie("Jersey", 4, 1100);
        Movie movie5 = new Movie("Bacchan Pandey", 3, 900);
        Movie movie6 = new Movie("Raja Babu", 4, 1100);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);

        System.out.println("Before Sorting:");
        for(Movie movie: movies){
            System.out.println(movie.getName() + " : " +  movie.getRatings());
        }
        System.out.println("");

        //sort the collection here
        Collections.sort(movies,new MovieComparator());


        System.out.println("After Sorting:");
        for(Movie movie: movies){
            System.out.println(movie.getName()  + " : " + movie.getRatings());
        }
    }
}

