import java.util.Scanner;

public class Taxi_fare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Taxi Number");
        String str = sc.nextLine();

        System.out.println("Enter Distance Covered");
        int dist = sc.nextInt();

        int fare;

        if (dist <= 5)
        {
            fare = 100;
        }
        else if (dist <= 15)
        {
            fare = 100 + (dist - 5) * 10;
        }
        else if (dist <= 25)
        {
            fare = 100 + 10 * 10 + (dist - 5) * 8;
        }
        else
        {
            fare = 100 + 10 * 10 + 10 * 8 + (dist -25) * 5;
        }

        System.out.println("Taxi Num " + str);
        System.out.println("Distance Covered " + dist);
        System.out.println("Fare " + fare);
    }
}
