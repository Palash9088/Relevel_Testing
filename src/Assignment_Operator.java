public class Assignment_Operator {
    public static void main(String[] args) {
        int a = 10;
        a+=20;
        System.out.println(a);

        int b = 20;
        b-=5;
        System.out.println(b);
        {
            int aa=20, bb=20;
            System.out.println(aa==bb); // Equality Operator

            int cc=20, dd=15;
            System.out.println(cc==dd); // Equality operator

            int a1=20, a2=20;
            System.out.println(aa!=bb); // Not equal operator
        }
    }
}
