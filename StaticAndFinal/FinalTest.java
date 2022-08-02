public class FinalTest {
    public final void sum(int b, int a)
    {

        int sum = a+b;
       System.out.println(sum);

    }
    public final void sum(int b, int a, int c)
    {
        int sum = a +b + c;
        System.out.println(sum);

    }
    public static void main(String[] args) {
     FinalTest obj = new FinalTest();

     obj.sum(40,50);
     obj.sum(20,30,40);
    }
}
