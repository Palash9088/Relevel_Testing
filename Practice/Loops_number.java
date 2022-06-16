import java.util.*;
public class Loops_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value");
        int n = scan.nextInt();

        for ( int i = 10; i>=n; i--)
        {
            for (int j=10 ; j <= i ; j++ )
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
