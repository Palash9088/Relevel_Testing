public class ProgramIEmployee {
    public static void main(String[] args) {

        InterfaceEmployee emp = new InterfaceEmployee(); //invoke function
        emp.printSalary(); // print salary
        System.out.println("Bonus :" + emp.getBonus()); // print bonus
        emp.totalSalary(); // printing total salary

    }
}
