public class Assignment_6 {

    public static void print(int output)
    {
        System.out.println("sum of two variable is " + output);
    }
    static int sum(int num1, int num2)
    {
        return num1 + num2;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Assignment_6 obj = new Assignment_6();

        int sum1 = Assignment_6.sum(a ,b);
        Assignment_6.print(sum1);


    }
}
