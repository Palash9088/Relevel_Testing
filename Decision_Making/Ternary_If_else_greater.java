public class Ternary_If_else_greater {
    public static void main(String[] args) {
        int num = 30;
        String output;


        if (num>=2)
        {
            if (num>=4)
            {
                output = "num is greater than 4";
            }
            else
            {
                output = "Greater than 2 but less than 2";
            }
        }
        else
        {
            output = "Number is less than 2";
        }
        System.out.println(output);
    }
}
