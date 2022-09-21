package Arrays;//import java.util.*;

public class Test1Interview {

    void m1(byte b)
    {
        System.out.println("byte");
    }
    void m1(short s)
    {
        System.out.println("short");
    }
  /*  void m1(int x)
    {
        System.out.println("Int");
    }*/
 /*   void m1(long l)
    {
        System.out.println("long");
    }*/
   /* void m1(float f)
    {
        System.out.println("float");
    }*/
   /* void m1(double d)
    {
        System.out.println("double");
    }*/
    void m1(Object obj)
    {
        System.out.println("obj");
    }

    public static void main(String[] args) {

        Test1Interview test = new Test1Interview();
        test.m1(5);
    }
}
