package Salary;

public class ProgramSalary {
    public static void main(String[] args) {
        DeveloperSalary dev = new DeveloperSalary(10000); // object call

        dev.devPrint();

        TesterSalary test = new TesterSalary(20000);

        test.testPrint();
    }
}
