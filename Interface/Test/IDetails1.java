package Test;

public interface IDetails1  {

    double test(int a, int b);

    static void m1(int a, int b) // static method can be applied in interface
    {

    }

    default void m1() // default method can be applied in interface
    {

    }
}
