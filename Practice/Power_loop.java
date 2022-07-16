import java.util.Scanner;

public class Power_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = sc.nextInt();

        System.out.println("Enter power");
        int power = sc.nextInt();

        // Using loop
        int result = 1;

        for (int i = 0; i<power; i++)
        {
            result = result * number;
        }
        System.out.println(result);

        // using math.pow

        double result1 = Math.pow(number, power);
        System.out.println(result1);

        // using type casting
        int result2 = (int)Math.pow(number, power);
        System.out.println(result2);
    }
}
