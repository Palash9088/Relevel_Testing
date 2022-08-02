public class InterfaceEmployee implements IEmployee {

    // In this class we have made a class & implements interface class
    private int salary = 2000; // instance variable


    // two methods which are forced by interface class
    @Override
    public void printSalary() {
        System.out.println("Salary is :" + salary);

    }

    @Override
    public int getBonus() {
        {
            return 1000;
        }
    }

    // class own method which we have declared
    public void totalSalary()
    {
        System.out.println("Total Salary is " + (salary + getBonus()));
    }
}
