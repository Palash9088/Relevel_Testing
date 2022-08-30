package Throws;

class A{

    void m1()
    {
        try{
        B b = new B();
        b.m2();}
        catch (RuntimeException RE)
        {
            System.out.println(2);
        }
    }
   /* void m1() throws ArithmeticException
    {
        try {
            int x = 10 / 0;
            System.out.println(x);
        }
        catch (ArithmeticException Ae)
        {
            System.out.println("AE");
        }

    }
    void m2()
    {
        m1();
    }
    void m3()
    {
        m2();
    }
    void m4()
    {
        m3();
    }
    void m5()
    {
        m4();
    }
*/
    public static void main(String[] args) {

        A a = new A();
        a.m1();
        System.out.println("End");
    }
}
