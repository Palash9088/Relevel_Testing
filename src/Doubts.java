import java.util.*;
public class Doubts {
    public static void main(String[] args) {
        // Check for the prime number

        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 2; i < num; i++) ;
        {

                if (num % 2 == 0) {
                    System.out.println("This is not a prime number");
                }
                else {


                    System.out.println("Prime number");


            }

        }
    }
}
