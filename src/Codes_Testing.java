import java.util.*;
public class Codes_Testing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();

        for(int i=0;i<=n;i++) //rows
        {
            for(int j=1; j<=i; j++) //cols
            {
                System.out.print("*");
            }
            System.out.println(); //blank line, so that we can enter into next row
        }

    }
}