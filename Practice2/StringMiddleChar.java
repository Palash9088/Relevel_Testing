public class StringMiddleChar {
    public void midString(String str)
    {
        int length = str.length();
        System.out.println("Length of character is ::"+ length);

        int middle = length/2;

        System.out.println("Char at middle is " + str.charAt(middle));
    }
    public static void main(String[] args) {

        StringMiddleChar obj = new StringMiddleChar();

        String str = "INDIA";
        obj.midString(str);

    }
}
