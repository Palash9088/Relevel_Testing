public class ValueOf {
    public static void main(String[] args) {

        int a = 10;
        long b = 20;
        float c = 20.3f;
        double d = 30.5d;
        long e = 2020;
        byte f = 127;
        char g = 'P';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        System.out.println();

        // after converting them to strings

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(e));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(g));

        // concat
        System.out.println(String.valueOf(a) + String.valueOf(g));

    }
}
