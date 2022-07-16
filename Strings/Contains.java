public class Contains {
    public static void main(String[] args) {
        String s1 = "This is really good";

        System.out.println(s1.contains("really")); // returns true as it contains

        if (s1.contains("Goos"))
        {
            System.out.println("Yes it contains the given string");
        }
        else
        {
            System.out.println("Sorry, It does not contain the given strings");
        }

    }
}
