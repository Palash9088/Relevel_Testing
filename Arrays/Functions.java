import java.util.*;
import java.lang.*;

public class Functions {
// function declaration
    // a method name sum taking inputs
    // num1 & num2
    public int sum (int n, int m)
    {
        return n + m;
    }
    public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter number 1");
                int n = scan.nextInt();
                System.out.println("Enter number 2");
                int m = scan.nextInt();

                Functions obj = new Functions();
                int output = obj.sum (n , m);
        System.out.println("output is : " + output);

    }
}
