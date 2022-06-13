public class Operator {
    public static void main(String[] args)
    {
        int A = 5;
        int B = 6;
        --A; // 4
        B++; // 7
        A = --B - ++A; // 6-5
        System.out.println(A);



    }
}