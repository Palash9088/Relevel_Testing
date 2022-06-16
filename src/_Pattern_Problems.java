import java.util.*;
public class _Pattern_Problems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value");
        int n = scan.nextInt();
        for
        (int i=1; i<=n; i++ ) // rows
        {
            for (int j=1; j<=i; j++) // cols
            {
                System.out.print(i + " ");
            }
            System.out.println(); // blank line to enter into next line
        }
        // ASCII value of upper case is 65 to 90

        /*for (int i=65; i<=90 ; i++ )
        {
            System.out.print((char)i + " ");
        }
        System.out.println();

        for (char ch='A' ; ch<='Z'; ch++)
        {
            System.out.print(ch + " ");
        }*/

    }
}