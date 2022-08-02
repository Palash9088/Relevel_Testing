package P1;//import java.util.*;

import P2.B;
public class A {

    public void m1()
    {
        System.out.println("P1.A.m1");
    }

    public static void main(String[] args) {

        A a = new A();
        a.m1();

        P1.B b2 = new P1.B();
        b2.m1();

        P2.B b1 = new P2.B(); // P2 m1 method
        b1.m1();

        P3.B b = new P3.B(); // qualified path for package 3 b2 method
        b2.m1();




    }
}
