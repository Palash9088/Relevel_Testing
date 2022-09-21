import java.util.Scanner;

public class Sum_of_Digit {
    public static void main(String[] args) {
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

        // Sum of reverse value
        int sum = 0;
        int rmd;
        do
        {
            rmd = reverse % 10;
            sum += rmd;
            reverse /= 10;
        }
        while (reverse>0);
        System.out.println("Sum of reversed value is " + sum);



    }
}

