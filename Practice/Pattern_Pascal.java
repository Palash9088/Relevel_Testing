import java.util.Scanner;

public class Pattern_Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for lower
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
