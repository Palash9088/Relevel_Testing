import java.util.Scanner;

public class Temp_F_to_Celsius_Switch {
    public static void main(String[] args) {
                /*Write a java programme using switch statement to convert a given temperature in
        Fahrenheit to Celsius and vice versa,and for an incorrect option,show some error
        message. Hint: c = 5/9*(f-32) and f=1.8*c+32(25 mins)*/

        Scanner scan = new Scanner(System.in);
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
        }
    }
}
