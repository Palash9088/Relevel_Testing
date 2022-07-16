public class ITProfessional {

    String EmpName;
    boolean doesPartyOnWeekend;
    boolean isAddictedToTea;
    boolean isAddictedToCoffee;
    boolean isAddictedToAlcohol;

    void empInfo (String empName)
    {
        EmpName = empName   ;
    }
    void setData(Boolean flag, boolean flag2, boolean flag3, boolean flag4)
    {
        doesPartyOnWeekend = flag;
        isAddictedToTea = flag2;
        isAddictedToCoffee = flag3;
        isAddictedToAlcohol = flag4;
    }
    void display()
    {
        System.out.println("Employee name is " + EmpName);
        System.out.println("doesPartyOnWeekend " + doesPartyOnWeekend);
        System.out.println("isAddictedToTea " + isAddictedToTea);
        System.out.println("isAddictedToCoffee " + isAddictedToCoffee);
        System.out.println("isAddictedToAlcohol " + isAddictedToAlcohol);
    }
    public static void main(String[] args) {

        ITProfessional info = new ITProfessional();

        info.empInfo("Palash");
        info.setData(false, true,false,false);
        info.display();
    }
}

