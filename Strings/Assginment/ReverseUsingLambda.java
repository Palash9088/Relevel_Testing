package Assginment;//import java.util.*;

public class ReverseUsingLambda{
    public static void main(String[] args) {

        IReverseString reverseStringLambda = (str ->
        {
            String rev = "";
            for (int i=str.length()-1;i>=0;i--)
            {
                rev = rev + str.charAt(i);
            }
            System.out.println(rev);
        });
        reverseStringLambda.ReverseString("Palash");
    }

}
