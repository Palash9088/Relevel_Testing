import java.util.Scanner;

public class PallindromeString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a text");
        String sc = scan.next();
        String  rev = "";

        for (int i = sc.length()-1; i>=0;i--)
        {
            rev = rev + sc.charAt(i);
        }
        System.out.println(rev);

        // check for pallindrome


        if (sc.equals(rev))
        {
            System.out.println("This is pallindrome");
        }
        else
        {
            System.out.println("This is not a pallindrome");
        }


    }
}
