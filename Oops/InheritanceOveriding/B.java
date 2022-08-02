package InheritanceOveriding;//import java.util.*;

public class B extends A{
    @Override
    public int m1(int a, int b, int c)
    {
        System.out.println("p");
        return a+b+c;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.m1(10,20,30));
    }
}
