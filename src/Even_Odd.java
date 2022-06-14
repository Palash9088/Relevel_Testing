import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0)
        {
            if (num % 3 == 0)
            {
                System.out.println(num + "Even number divisible by 3");
            }
            else
            {
                System.out.println(num + "Even Number not divisible by 3 ");
            }
        }
        else
        {
            System.out.println(" Odd Number ");
        }



    }
}

