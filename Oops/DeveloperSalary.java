public class DeveloperSalary extends EmployeeSalary {

    public int salary;
    public DeveloperSalary(int salary) // constructor
    {
        super(5000);
        this.salary = salary;
    }

    public void devPrint () // made print function
    {
        int devS = bonus + salary;
        System.out.println("Dev salary is " + devS);
    }
}
