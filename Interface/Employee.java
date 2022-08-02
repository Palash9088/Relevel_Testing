public class Employee implements ISalary,IDetails {
    @Override
    public void print(int salary) {
        System.out.println("Salary is " + salary);
    }

    @Override
    public void printBonus(int bonus) {
        System.out.println("Bonus is " + bonus);

    }

    @Override
    public void printName(String name) {
        System.out.println("Employee name is " + name);
    }

    @Override
    public void printNum(long num) {
        System.out.println("Employee number is " + num);
    }

}

