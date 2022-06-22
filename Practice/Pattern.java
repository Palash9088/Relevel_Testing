import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();

        for (int i = n ; i>=1 ; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // decrementing

        for (int i = 0; i<=n ; i++)
        {
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }

    }
}
