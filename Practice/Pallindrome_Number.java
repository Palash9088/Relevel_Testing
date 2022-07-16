import java.util.Scanner;

public class Pallindrome_Number {
    public int reverseNum (int num)
    {
        int reverse = 0;
        int remainder;

        while (num>0) {
            remainder = num % 10;
            reverse = 10 * reverse + remainder;
            num /= 10; // updating the number with quotient
        }
        return reverse;
    }
    public void checkPallindrome(int num, int reverse)

    {
        if (num == reverse) {
            System.out.println("Pallindrome number");
        }
        else
        {
            System.out.println("Not a Pallindrome number");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        Pallindrome_Number obj = new Pallindrome_Number();

        int reverseNumber = obj.reverseNum(num);

        obj.checkPallindrome(num,reverseNumber);

    }
}
