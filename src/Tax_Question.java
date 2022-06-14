import java.util.*;
public class Tax_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = scan.nextLine();

        System.out.println("Enter Age");
        int age = scan.nextInt();

        System.out.println("Enter Income");
        double income = scan.nextDouble();

        double tax = 0 ;
        if (age>=60)
        {
            tax = 0;
            System.out.println("Wrong Category");
        }
        else
        {
            if(income <= 250000)
            {
                System.out.println(" Zero Tax");
                tax = 0;
            }

            else if (income > 250000 && income <= 500000)
        {
            tax = (income - 160000) * (0.1);
        }
            else if (income > 500000 && income <= 1000000)
            {
                tax = (income - 500000) * .2 + 34000;
            }
            else if (income > 1000000)
            {
                tax = ((income - 1000000) * (.3)) + 94000;
            }
        }
        System.out.println("Name" + name );
        System.out.println("Age" + age );
        System.out.println("Payable tax " + tax);

    }
}

