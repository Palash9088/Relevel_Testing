package ComparatorStudent;//import java.util.*;

public class Student {
    public Student(String studentName, int rollNo, double percentage)
    {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    String studentName;
    int rollNo;
    double percentage;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


}
