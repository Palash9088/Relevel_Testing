public class Trim {
    public static void main(String[] args) {

        String s1 = "       hey how are you          ";
        String s2 = "hey how are you             ";
        String s3 = "           hey how are you";


        // removes white spaces from leading & trailing or starting & ending

        System.out.println(s1.trim());
        System.out.println(s2.trim());
        System.out.println(s3.trim());
    }
}
