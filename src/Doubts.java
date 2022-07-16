public class Doubts {

    int sum;
    char a;
    String ab;
    public long method(int num1, int num2)
    {
        System.out.println(sum);
        System.out.println(a);
        System.out.println(ab);
        int sum1;
        sum1 = num1 + num2;
        System.out.println(sum1);
        return sum1;
    }
    public static void main(String[] args) {
        Doubts obj = new Doubts();
        int sum2 = (int) obj.method(5,5);
        System.out.println(sum2);

    }
}
