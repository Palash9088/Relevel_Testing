public class Practice1 {
    public static void main(String[] args) {

        int num = 321;
        int rev = 0;
        int rem;

        while (num>0)
        {
            rem = num%10;
            rev = 10*rev+rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
