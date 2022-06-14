import java.util.*;
public class Assignment_1 {
    public static void main(String[] args) {
        /*Requirements: "1. Print the number of days in a month using the switch case.
        Take the month number and year as input from the user.
                Note: If the year is a leap year, month 2 (i.e., February) has 29 days.*/

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter year");
        int year = scan.nextInt();

        System.out.println(" Month number ");
        int month = scan.nextInt();

        switch (month) {
            case 1:
                System.out.println("Jan has 31 days");
                break;
            case 2:
                if (year % 2==0) {
                    System.out.println("Feb has 29 days");
                }
                else
                {
                    System.out.println("Feb has 28 days");
                }
                break;
            case 3:
                System.out.println("March has 31 Days ");
                break;
            case 4:
                System.out.println("April has 30 Days ");
                break;
            case 5:
                System.out.println("May has 31 Days ");
                break;
            case 6:
                System.out.println("June has 30 Days ");
                break;
            case 7:
                System.out.println("July has 31 Days ");
                break;
            case 8:
                System.out.println("Aug has 31 Days ");
                break;
            case 9:
                System.out.println("Sept has 30 Days");
                break;
            case 10:
                System.out.println("Oct has 31 Days ");
                break;
            case 11:
                System.out.println("Nov has 30 Days ");
                break;
            case 12:
                System.out.println("Dec has 31 Days");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
