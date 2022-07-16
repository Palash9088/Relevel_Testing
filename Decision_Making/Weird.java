import java.util.Scanner;

public class Weird {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String f = scan.nextLine();
        int a = scan.nextInt();
        double b = scan.nextDouble();

        System.out.println("String: " + f);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
