import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
                /* 1. OverridingEx.Program to take 10 integers as input from keyboard
            using loop and print the average of those numbers*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Value num1");
        int num1 = scan.nextInt();

        System.out.println("Enter Value num2");
        int num2 = scan.nextInt();

        int sum = 0;
        int index;
        float average;
        int count = 0;
        for ( index = num1; index <= num2; index++)
        {
            // sum
            sum += index;
            count++;
        }
        System.out.println("Sum of all the digits is " + sum);
        System.out.println("Sum of all the digits is " + count);

        // Average of sum of number
        average = sum/count;
        {
            System.out.println("Average of sum of numbers is : " +  average);
        }
    }
}
