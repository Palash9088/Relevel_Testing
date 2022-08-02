package CalculateSalary;//import java.util.*;

public class Employee {
    String name;
    int age;
    long contact;
    String address;
    double salary;

    public void calculateSalary(double salary)
    {
        this.salary = salary;
        double pf = salary * 12/100; //pf deducted 12% of salary as calculate salary program
        salary = salary - pf;
    }
   public void setDetails(String name, int age, long contact, String address, double salary)
    {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        calculateSalary(salary);
    }
    public void display()
    {
        System.out.println("\nEmployee Name " + name);
        System.out.println("Employee Age  " + age);
        System.out.println("Employee Contact number " + contact);
        System.out.println("Employee Address " + address);
        System.out.println("Employee Salary " + salary );
    }

}
