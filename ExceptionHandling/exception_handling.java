class exception_handling
{
    void m1() throws ArithmeticException{

    }
    void m2 () {

    }
    public static void main(String args[])
    {
        try {
            int a = args.length;
            int b = 10/a;
            System.out.println(a);
        }
        catch(ArithmeticException w)
        {
            System.out.println("1");
        }
    }
}