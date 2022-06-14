public interface Min_Max_If_else {
    public static void main(String[] args) {
        // Print max of 3 numbers

        int num1 = 7001, num2 = 6001, num3 = 2001;
        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println( "num1 " + num1 + " is largest");
        }
        else if (num2 >= num1 && num2 >= num3) // checking number 2 is greater than num 1 & 3
        {
            System.out.println( "num2 " + num2 + " is largest");
        }
        else  // checking number 3 is greater than num 1 & 2
        {
            System.out.println("num 3 " + num3 + " is largest ");
        }
    }
}
