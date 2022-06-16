import java.util.Scanner;

public class Reverse_a_Number {
    public static void main(String[] args) {
        // Reverse of a Number
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reverse = 0;
        int remainder;

        while (num>0)
        {
            remainder = num % 10;
            reverse = 10 * reverse + remainder;
            num /= 10; // updating the number with quotient
        }
        System.out.println("reverse of a number " + reverse);

        int i;
        for ( i=2; i<reverse; i++) ;
        if (reverse / 2 ==0 )
        {
            boolean isprime = false;
        }
    }
}
