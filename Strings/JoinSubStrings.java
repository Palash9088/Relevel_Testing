public class JoinSubStrings {
    public static void main(String[] args) {

        String s1 = "you";
        String s2 = "are";
        String s3 = "beautiful";

        System.out.println(String.join(" ",s1,s2,s3)); // delimiter is set to a space, so it is joining with space

        System.out.println(String.join("_",s1,s2,s3)); // delimiter is set to underscore
    }
}