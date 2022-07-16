public class Empty {
    public static void main(String[] args) {

        // checks if a string is empty or not

        String s1 = "checkempty";
        String s2 = "  ";
        String s3 = "";

        System.out.println(s1.isEmpty()); // returns false as it is not empty
        System.out.println(s2.isEmpty()); // returns false as it checks string length
        System.out.println(s3.isEmpty()); // returns true as it is a empty string

        System.out.println("-------------------------------------------------------");
        System.out.println("Check for isblank");
        System.out.println("-------------------------------------------------------");

        System.out.println(" isBlank : " + s1.isBlank()); // returns false as it contains string
        System.out.println( "isBlank : "+ s2.isBlank() + " as it contains white spaces. "); // returns true as it does not check string length
        System.out.println("isBlank : " + s3.isBlank()); // returns true as it is an empty string


    }
}
