import java.util.Scanner;

public class Assignment_4_1 {
    public static void main(String[] args) {

        // Arm strong number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int rem = 0;
        int sum = 0;
        int temp = num;

      while (num>0)
      {
          rem = num % 10;
          System.out.println("rem is " + rem);
          sum = sum + (rem * rem * rem);
          System.out.println(" sum is " + sum);
          num = num / 10;
          System.out.println(" num is " + num);
      }
      if (temp == sum)
      {
          System.out.println("Number is Armstrong number");
      }
      else
      {
          System.out.println("Number is not a Armstrong number");
      }

    }
}
