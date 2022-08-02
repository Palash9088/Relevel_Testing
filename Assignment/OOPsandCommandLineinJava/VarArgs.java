package OOPsandCommandLineinJava;//import java.util.*;

public class VarArgs {

    static int multiply(int...args)
    {
        int product=1;
        for(int i=0;i< args.length;i++)
        {
                product = product * args[i];
        }
        return product;
    }
    public static void main(String[] args) {

        int product = VarArgs.multiply(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Multiplication of given integer is " + product);

    }
}
