public class Example2 {
    static void m1()
    {
        try
        {
            System.out.println(2);
            int x =5/0;
        }
        catch(Exception e)
        {
            System.out.println(1);
        }
        Example1 obj = null;
        try
        {
            System.out.println("hi");
            obj.m1(0);
            System.out.println(3);
        }
        catch (NullPointerException np)
        {
            System.out.println(4);
        }
        System.out.println(6);
        System.out.println(7);
    }

    public static void main(String[] args) {
        m1();
    }
}
