public class Typecastexample {
    public static void main(String[] args) {

        float floatvalue = 4.6f;
        System.out.println(floatvalue);

        char vowel = 'a';
        System.out.println("character value is : " + vowel);

        String text = "hey how are you";
        System.out.println("String value is : "+ text);

        boolean BooleanValue = Boolean.TRUE;
        System.out.println("Boolean value is : " + BooleanValue);

        byte num = 50;
        System.out.println ("Before type casting : " + num);

        //widening type casting
        double newValue = num;
        System.out.println("Afer type casting : " + newValue);
    }
}
