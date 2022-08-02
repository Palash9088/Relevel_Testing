package CalculateSalary;//import java.util.*;

public class Manager extends Employee {
    String department;
    String role;

   @Override
    public void calculateSalary(double salary)
    {
        this.salary = salary;
        double pf = salary * 12/100;
        this.salary = salary - pf;
    }

    public void setDetails(String name, int age, long contact, String address, double salary,String department, String role)
    {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        calculateSalary(salary);
        this.department = department;
        this.role = role;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee Dept. " + department);
        System.out.println("Employee Role " + role);
    }
}
