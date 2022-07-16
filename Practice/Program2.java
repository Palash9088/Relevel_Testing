import java.util.Scanner;

public class Program2 {

    public void dayS(int n)
    {
       int day = n;
        switch (day)
        {
            case 1:
                System.out.println("Day is monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid input");
                break;

        }

    }
    public static void main(String[] args) {
        Program2 obj = new Program2();

        Scanner scan = new Scanner(System.in);
        System.out.println("enter num 1 - 7");
        int sc = scan.nextInt();
        obj.dayS(sc);
    }
}
