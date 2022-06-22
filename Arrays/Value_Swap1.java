public class Value_Swap1 {
    public static void main(String[] args) {
        // using 3rd variable
        int a = 2;
        int b = 5;

        System.out.println("Before Swap a is " + a);
        System.out.println("Before Swap b is " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap a is " + a);
        System.out.println("After Swap b is " + b);

        // without using 3rd variable

        int i = 2;
        int j = 5;

        System.out.println("Before Swap i is " + i);
        System.out.println("Before Swap j is " + j);

        i = i + j; //i = 7
        j = i - j; //j = 7 - 5 = 2
        i = i - j; //i = 7 - 2 = 5

        System.out.println("After Swap i is " + i);
        System.out.println("After Swap j is " + j);

    }
}
