public class Intern {
    public static void main(String[] args) {


        // this returns
        String s1 = "Hello string";
        String s2 = new String("Hello string");
        String s3 = "hello String";

        System.out.println(s1 == s2); // both are same string but returns false as they belong diffrent memory

        System.out.println(s1.equals(s2)); // returns true as both string is same

        System.out.println(s1.intern() == s2.intern()); // check for string object & in string pools is same

        System.out.println(s1.intern() == s3.intern()); // Case Sensitive


    }
}
