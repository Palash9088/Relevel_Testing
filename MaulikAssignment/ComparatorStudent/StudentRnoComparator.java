package ComparatorStudent;//import java.util.*;

import java.util.Comparator;

public class StudentRnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student object1, Student object2) {
        return object1.rollNo - object2.rollNo;
    }
}
