package ComparatorStudent;//import java.util.*;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student object1, Student object2) {
        return object1.studentName.compareTo(object2.studentName);
    }
}
