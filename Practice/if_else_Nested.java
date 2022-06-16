import java.util.*;
public class if_else_Nested {
    public static void main(String[] args) {
        // Display weekday using input
        Scanner scan = new Scanner(System.in);
        char ch;
        System.out.println("Enter weekday number");
        int num = scan.nextInt();

        do {

            if (num == 1) {
                System.out.println("Monday");
            } else if (num == 2) {
                System.out.println("Tuesday");
            } else if (num == 3) {
                System.out.println("Wednesday");
            } else if (num == 4) {
                System.out.println("Thursday");
            } else if (num == 5) {
                System.out.println("Friday");
            } else if (num == 6) {
                System.out.println("Saturday");
            } else if (num == 7) {
                System.out.println("Last day of week - Sunday");
            }
            else
            {
                System.out.println("Invalid Input");
            }
            System.out.println("Press y to continue");
            ch = scan.next().charAt(0);
        }
        while (ch == 'y' || ch== 'Y');
    }
}
