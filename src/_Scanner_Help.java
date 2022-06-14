import java.util.Scanner;

public class _Scanner_Help {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter Int Value");
        int num = scan.nextInt();
        System.out.println("Value entered by you " + num);

        System.out.println("Enter String / Sentence");
        String str = scan.nextLine();
        System.out.println("String / Sentence entered by you " + str);

        System.out.println("Enter Float Value");
        Float num1 = scan.nextFloat ();
        System.out.println(" Float value entered by you " + num1);

        System.out.println("Enter Double Value");
        Double num2 = scan.nextDouble ();
        System.out.println("Double Value entered by you " + num2);

        System.out.println(" Enter Byte Value");
        Byte num3 = scan.nextByte ();
        System.out.println("Value entered by you " + num3);

        System.out.println("Enter Boolean expression");
        Boolean value = scan.nextBoolean ();
        System.out.println("Expression entered by you " + value);

        System.out.println("Enter Long Value");
        Long num4 = scan.nextLong ();
        System.out.println(" Long Value entered by you " + num4);

        System.out.println("Enter Long Value");
        Short num5 = scan.nextShort ();
        System.out.println("Value entered by you " + num5);
    }
}
