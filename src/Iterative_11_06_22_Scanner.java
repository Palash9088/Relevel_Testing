import java.util.*;
public class Iterative_11_06_22_Scanner {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner (System.in);

        System.out.println("Enter Int Value");
        int num = scan.nextInt();
        System.out.println("Value entered by you " + num);

        System.out.println("Enter String / Sentence");
        String str = scan.nextLine();
        System.out.println("String / Sentence entered by you " + str);

        System.out.println("Enter Float Value");
        Float num1 = scan.nextFloat ();
        System.out.println(" Float value entered by you " + num1);

        System.out.println("Enter Double Value");
        Double num2 = scan.nextDouble ();
        System.out.println("Double Value entered by you " + num2);

        System.out.println(" Enter Byte Value");
        Byte num3 = scan.nextByte ();
        System.out.println("Value entered by you " + num3);

        System.out.println("Enter Boolean expression");
        Boolean value = scan.nextBoolean ();
        System.out.println("Expression entered by you " + value);

        System.out.println("Enter Long Value");
        Long num4 = scan.nextLong ();
        System.out.println(" Long Value entered by you " + num4);

        System.out.println("Enter Long Value");
        Short num5 = scan.nextShort ();
        System.out.println("Value entered by you " + num5);*/

        // Check for the prime number

        /*System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 2; i < num; i++) ;
        {
            {
                if (num % 2 == 0)
                {
                    System.out.println("This is not a prime number");
                }
                else
                {
                    System.out.println("Prime number");
                }
            }

        }*/

 // Reverse of a Number
       /* System.out.println("Enter a Number");
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
        }*/

        /*Program to input the cost price and the selling price of an object.
        If the selling price is more than the cost price then calculate and display actual profit and profit per cent otherwise,
        calculate and display actual loss and loss per cent. If the cost price and the selling price are equal,
        the program displays the message 'Neither profit nor loss
         */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost price");
        int cp = sc.nextInt();

        System.out.println("Enter Selling price");
        int sp = sc.nextInt();

        if (sp>cp)
        {
            int profit = sp-cp;
            float profitpercentage = (profit*100)/cp;
            System.out.println("Profit = " + profit + " & Profit percentage is "  + profitpercentage);
        }
        else
        {
            int loss = (cp-sp);
            float losspercentage = (loss*100)/cp;
            System.out.println("Loss = "  + loss + " Loss percntage is " + losspercentage);
        }*/

        // Another way of doing it

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost price");
        int cp = sc.nextInt();

        System.out.println("Enter Selling price");
        int sp = sc.nextInt();
        int diffrencecost = sp-cp;
        float percentage = (diffrencecost*100)/cp;

        if (diffrencecost>0) // if diffrence in cost is positive then it is profit
        {
            System.out.println("Profit = " + diffrencecost + " & Profit percentage is "  + percentage);
        }
        else //if difference in cost is Negative then it is
        {
            System.out.println("Loss = "  + Math.abs(diffrencecost) + " Loss percntage is " + Math.abs (percentage));
        }*/


       // math class
        /*int  num20 = -60;
        System.out.println(Math.abs(num20));

        int num1=10, num2=20, num3=-20;
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.max(num1 , num2));*/

        /*Write a java programme using switch statement to convert a given temperature in
        Fahrenheit to Celsius and vice versa,and for an incorrect option,show some error
        message. Hint: c = 5/9*(f-32) and f=1.8*c+32(25 mins)*/

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Select from the given options");
        System.out.println(" 1. Fahrenheit to Celsius ");
        System.out.println(" 2. Celsius to Fahrenheit ");
        int choice = scan.nextInt();
        double f, c ;
        switch (choice)
        {
            case 1: // F to C
                System.out.println("Enter the temprature in Fahrenheit");
                f = scan.nextDouble();

                c = (5/9.0) * (f-32);
                System.out.println("Temprature in C" + c );
                break;

            case 2: // C to F
                System.out.println("Enter temprature in Celsius");
                c = scan.nextDouble();

                f =  1.8 * c + (32);
                System.out.println("temprature in Fahrenheit " + f);
                break;

            default:
                System.out.println("Invalid input");
        }*/
    }
}
