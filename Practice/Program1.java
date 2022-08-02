import java.util.Scanner;

public class Program1 {

    public void salesCom (int n)
    {
        if (n<=20000 && n>=0)
        {
           int com = (n*5/100);
            System.out.println("Sales commission is :" + com + " Total is : " + (n+com) );
        }
        else if (n<=40000 && n>=20000)
        {
            int com2 = (n*10/100);
            System.out.println("Sales commission is :" + com2 + " Total is : " + ( n + com2) );
        }
        else
        {
            int com3 = (n*20/100);
            System.out.println("Sales commission is :" + com3 + " Total is : " +  (n +com3) );
        }

    }
    public static void main(String[] args) {

       /* ProgramTest obj = new ProgramTest();*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sales");
        int sc = scan.nextInt();


    }
}
