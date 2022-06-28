import java.util.Scanner;

public class Assignment_1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter Principle amount");
            int P = scan.nextInt();

            System.out.println("Enter Rate");
            float R = scan.nextFloat();

            System.out.println("Enter time in Months");
            float T = scan.nextFloat();

            System.out.println("Rate of Interest is " + R + "%" + ", Duration is " + T + " Months");

            float SI = (P * R * T) / 100;
            System.out.println("Total Interest is : " + SI);

            float F = SI + P;
            System.out.println("Final amount is : " + F);

            System.out.println("Press Y to continue");
            ch = scan.next().charAt(0);
        }
        while
        (ch == 'Y' || ch == 'y');
    }
}
