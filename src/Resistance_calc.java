import java.util.Scanner;

public class Resistance_calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char ch;
        do
        {
            System.out.println("Enter R1");
            float num1 = scan.nextFloat();

            System.out.println("Enter R2");
            float num2 = scan.nextFloat();

            float result = 0f;

            System.out.println("Enter your choice");
            System.out.println("1. Series");
            System.out.println("2. Parallel");
            int choice = scan.nextInt();

            switch (choice)
            {
                case 1:
                    result = num1 * num2;
                    break;
                case 2:
                    result = (num1 * num2) / (num1 + num2);
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
            System.out.println("Value of Resistance is " + result);

            System.out.println("Press Y to continue");
            ch = scan.next().charAt(0);
        }while (ch == 'y' || ch == 'Y');
    }
}
