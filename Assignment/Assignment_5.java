import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n");
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 1; i<=n; i++ )
        {
            for (int j = 1; j<=i; j++)
            {
                sum = sum + j;
            }
            System.out.println("sum = " + sum);
        }

    }
}
