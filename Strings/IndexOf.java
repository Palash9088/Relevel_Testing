public class IndexOf {
    public static void main(String[] args) {

        String s1 = "the quick brown fox jump over the lazy dog.";

        s1.replace("dog","clock");

        System.out.println(s1.indexOf('H')); // index of char 'H'
        System.out.println(s1.indexOf("how")); // index of string "how"

        // index of whole string

        for (int i=0; i<s1.length();i++)
        {
            System.out.println(("Index of char " + s1.charAt(i))  + " : " + s1.indexOf(s1.charAt(i)));
        }

        System.out.println(s1.indexOf('h')); // return zero first occurrence
        System.out.println(s1.indexOf('H')); // char not available returns -1
    }
}
