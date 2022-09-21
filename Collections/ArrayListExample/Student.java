package ArrayListExample;//import java.util.*;

public class Student {
    int empId;
    String name;
    String dept;
    double salary;
    char gender;

    public Student(int empId, String name, String dept, double salary, char gender) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.gender = gender;
    }
    public String toString()
    {
        return  this.empId + " : " + this.name+ " : " +this.dept+ " : " +this.salary+ " : " +this.gender;
    }
}
