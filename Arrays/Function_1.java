import java.util.Scanner;

public class Function_1 {
    public int sum(int num1 , int num2)
            // this takes 2 values
    {
        int result = num1 + num2 + 100;
        return result;
    }

    public void print(int output)
            // this is print functions
    {
        System.out.println("Sum is :" + output);
    }

    public static void main(String[] args) {

        /*take num1 & num2
        add num1 & num2
        take num 3 & num4
        add num3 & num4


        we will be creating 2 function
        1. this will take input number from user
        2. to display the calculated values */


        // Without function

        Scanner scan = new Scanner(System.in);
        Function_1 Function1 = new Function_1(); // function class

        System.out.println("Enter num 1 ");
        int num1  = scan.nextInt();

        System.out.println("Enter num 2 ");
        int num2  = scan.nextInt();

        int sum1 = Function1.sum(num1, num2); // here we are passing comma separated value
        Function1.print(sum1);

        // duplicating the code
        System.out.println("Enter num 3 ");
        int num3  = scan.nextInt();

        System.out.println("Enter num 4 ");
        int num4  = scan.nextInt();

        int sum2 = Function1.sum(num3, num4);
        Function1.print(sum2);
    }
}
