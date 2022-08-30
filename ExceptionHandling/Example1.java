public class Example1 {
    static void m1(int x)
    {
        try
        {
            System.out.println(1);
            int z = 10 / x;
            System.out.println(z);
            System.out.println(2);
            String str = "hi";
            System.out.println(str.length());
            System.out.println(5);
            int [] arr = {1,2,1};
            System.out.println(arr [4]);
            System.out.println(6);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Exception handled");
            System.out.println(3);
        }
        catch (NullPointerException np)
        {
            System.out.println("NP Exception");
            np.printStackTrace();

        }
        catch(StringIndexOutOfBoundsException Aae)
        {
            System.out.println("Exception Array");
            Aae.printStackTrace();
        }
        /*finally
        {
            System.out.println("Finally Block");
        }*/
        System.out.println(4);
    }

    public static void main(String[] args) {
        m1(10);
        System.out.println(7);
        int a = 5;
        Integer b = a;

    }
}
