public class CompareCases {
    public static void main(String[] args) {

        String s1 = "palash soni";
        String s2 = "Palash Soni";

        // using equals to ignore
        System.out.println(s1.equalsIgnoreCase(s2));

        // using comapare to igore case
        System.out.println(s1.compareToIgnoreCase(s2));

        if (s1.toLowerCase().equals(s2.toLowerCase()))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
