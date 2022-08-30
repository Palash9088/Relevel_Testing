package ComparatorStudent;//import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<Student>();

        Student student1 = new Student("Palash",101,88.2);
        Student student2 = new Student("Arklin",102,95.5);
        Student student3 = new Student("Palak",103,88.3);
        Student student4 = new Student("Mark",104,86.5);
        Student student5 = new Student("Parth",105,90.4);
        Student student6 = new Student("Rahul",106,80.9);


        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        System.out.println("Before Comparator");
        for(Student student : studentList)
        {
            System.out.println("Name : " + student.getStudentName() + " Roll No. : "
                    + student.getRollNo()+" Percentage : " +student.getPercentage());
        }

        Collections.sort(studentList,new StudentNameComparator());

        String x = System.lineSeparator();

        System.out.println(x+ "After Comparator");
        for(Student student : studentList)
        {
            System.out.println("Name : " + student.getStudentName() + " Roll No. : "
                    + student.getRollNo()+" Percentage : " +student.getPercentage());
        }

    }
}
