import java.math.BigInteger;
import java.util.Scanner;

public class Assignment_1_2 {
    public static void main(String[] args) {

        /*  2. Find if the given number N is even or odd.
        Print 0 if the number is even; otherwise, print 1 if the number is odd.
        Note: N ranges from [1, 10^9]"*/

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Number");
        double num = scan.nextDouble();

        if (num % 2 == 0 )
        {
            System.out.println(" 0 ");
        }
        else
        {
            System.out.println(" 1 "); // Odd Number
        }
    }
}
