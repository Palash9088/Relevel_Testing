//import java.util.*;
public class Example3 {

    void m1()
    {
        try {
            System.out.println(5);
            int x = 10/2;
            System.out.println(x);
            try{
                System.out.println(4);
                String str = "hi";
                str.length();

                int arr[] = new int[3];
                System.out.println(arr[4]);
            }
            catch (NullPointerException NE)
            {
                System.out.println(1);
                System.out.println("Exception Caught NE");
            }
            catch (ArrayIndexOutOfBoundsException AI)
            {
                System.out.println(3);
                System.out.println("Exception Caught AI");
            }
        }
        catch (ArithmeticException AE)
        {
            System.out.println(2);
            System.out.println("Exception Caught AE");
        }
    }

    public static void main(String[] args) {

        Example3 a = new Example3();
        a.m1();
    }
}
