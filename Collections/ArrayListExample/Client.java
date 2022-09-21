package ArrayListExample;//import java.util.*;

import java.util.ArrayList;

public class Client {
    static void printStudentDetails(ArrayList<Student> studentArrayList)
    {
        for(Student student1 : studentArrayList)
        {
            System.out.println(student1.toString());
        }
        System.out.println(studentArrayList.size());
        //System.out.println(student.empId + " : " + student.name+ " : " +student.dept+ " : " +student.salary+ " : " +student.gender);
    }

    public static void main(String[] args) {
        Student student = new Student(101,"Palash", "IT", 200000,'M');
        Student student1 = new Student(102,"Kapil","Admin",150000,'M');
        Student student2 = new Student(103,"Rahul","IT",150000,'M');
        Student student3 = new Student(104,"Palak","IT",150000,'F');

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101,"Palash", "IT", 200000,'M'));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Client.printStudentDetails(studentList);
    }
}
