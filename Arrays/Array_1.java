public class Array_1 {
    public static void main(String[] args) {
        int [] values = {1 , 2, 3, 4, 5};
        float [] floatvalues = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f };
        String str [] = {"Palash", "Palak", "Hanu", "Priyal", "Payal"};

        // access values
        System.out.println( "Value at index 3 is numbers "  +  values[3]);
        System.out.println("Value at index 3 float value is  " + floatvalues[3]);
        System.out.println("Value at index 3 String is "  + str[3]);

        // to get length of  the array
        System.out.println("Length of string is " + str.length);
        System.out.println("Length of numbers is     " + values.length);
        System.out.println( "Length of float value is " + floatvalues.length);

    }
}
