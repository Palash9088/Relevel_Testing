public class String_length {
    public static void main(String[] args) {

        String str = "HELLO";
        int length = str.length();
        System.out.println("Length of string " + str.length());

        // Character at zero

        System.out.println("Character at index zero " + str.charAt(0));

        // all the characters

        for (int i = 0; i<length; i++ ) //loop to print
        {
            System.out.println("Character at Index " + i + " is " + str.charAt(i));
        }
    }
}
