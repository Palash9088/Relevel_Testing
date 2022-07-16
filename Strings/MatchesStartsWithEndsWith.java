public class MatchesStartsWithEndsWith {
    public static void main(String[] args) {

        String s1 = "pallen drome";
        String s2 = "palash sonie";
        String regex = "^p.........e$"; // starts with p & ends with e
        System.out.println(s1.matches(regex));
        System.out.println(s1.matches(s2));

        System.out.println("---------------------------------------------------------");

        System.out.println("// Starts with //");

        System.out.println(s1.startsWith("pa")); // as it starts with pa returns true

        System.out.println(s1.startsWith("en",4)); // if starts with index 4 substring then true
        System.out.println(s1.startsWith("en",5)); // check if starts with index 5 substring false

        System.out.println("---------------------------------------------------------");

        System.out.println("// Ends with //"); // if a string ends with that substring

        System.out.println(s1.endsWith("pallen")); // as it ends with drome returns false
        System.out.println(s1.endsWith("drome")); // as it ends with drome it returns true




    }
}
