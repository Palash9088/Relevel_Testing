import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char ch;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Value num1");
            double num1 = scan.nextDouble();

            System.out.println("Enter Value num2");
            double num2 = scan.nextDouble();

            System.out.println("Enter operator (+ , - , * , /)");
            char op = scan.next().charAt(0); // to take character input from user

            double result = 0.0d;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.println(" Invalid");
                    break;

            }
            System.out.println(result);
            System.out.println("Press Y to continue");
            ch = scan.next().charAt(0);
        }
        while (ch == 'y' || ch == 'Y');
    }
}
