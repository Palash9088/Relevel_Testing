package ComparatorStudent;//import java.util.*;

import java.util.Comparator;

public class StudentPercentageComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o2.percentage - o1.percentage);
    }
}
