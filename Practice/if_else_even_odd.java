public class if_else_even_odd {
    public static void main(String[] args) {
        int num = 20;

        // even numbers which can be divided by 2 & gives remainder 0
        // odd numbers which can be divided by 3 & gives remainder 0

        if (num % 2 == 0 )
        {
            System.out.println(num + " is even number");
        }
        else if (num % 3 == 0 )
        {
            System.out.println(num + " is odd number");
        }
    }
}
