package Salary;

public class TesterSalary extends EmployeeSalary {
    int salary;
    public TesterSalary(int salary) // constructor
    {
        super(5000);
        this.salary = salary;
    }
    public void testPrint ()
    {
        int testSalary = bonus + salary;
        System.out.println("Tester salary is " + testSalary);
    }
}
