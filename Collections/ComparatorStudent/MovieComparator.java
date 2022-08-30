package ComparatorStudent;//import java.util.*;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
      if(o2.getRatings() != o1.getRatings())
      {
          return o2.getRatings() - o1.getRatings();
      }
      else if (o2.getNoOfRatings() != o1.getNoOfRatings())
      {
          return o2.getNoOfRatings() - o1.getNoOfRatings();
      }
      else
          return o1.getName().compareTo(o2.getName());
    }
}
