import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter S");
        String sc = scan.next();
        System.out.println(sc);

        System.out.println("Enter char");
        char alpha = scan.next().charAt(0);

        int count = 0;
        for (int i=0; i<sc.length()-1;i++)
        {
            if (sc.charAt(i) == alpha)
            {
                count++;
            }
        }
        System.out.println("Frequency of character " + alpha + " is "  + count );
    }
}
