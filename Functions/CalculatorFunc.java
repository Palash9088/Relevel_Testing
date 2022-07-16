public class CalculatorFunc {

        void add (int a, int b)
        {
            System.out.println("addition is " + (a + b) );
        }
        void sub (int a, int b)
        {
            System.out.println("Sub is " + (a-b));
        }
        void divi(int a, int b)
        {
            System.out.println("divi is " + (a/b));
        }
        void multi (int a, int b)
        {
            System.out.println("Multi is " + (a*b));
        }

    public static void main(String[] args) {

        CalculatorFunc calci = new CalculatorFunc();
        calci.add(10,20);
        calci.sub(20,10);
        calci.divi(30,10);
        calci.multi(30,10);

    }
}
