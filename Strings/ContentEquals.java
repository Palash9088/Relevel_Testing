public class ContentEquals {
    public static void main(String[] args) {

        String s1 = "hello norway";

        CharSequence s2 = "hello norway";
        CharSequence s3 = "hello paris";

        StringBuilder s4 = new StringBuilder("hello norway");
        StringBuilder s5 = new StringBuilder("hello paris");

        // compare string with char sequence
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.contentEquals(s3));

        //compare with string builder
        System.out.println(s1.contentEquals(s4));
        System.out.println(s1.contentEquals(s5));

        StringBuffer s6 = new StringBuffer("hello norway");
        StringBuffer s7 = new StringBuffer("hello paris");

        System.out.println(s1.contentEquals(s6));
        System.out.println(s1.contentEquals(s7));
    }
}
