public class CompareStringEx {
    public void compareTo(String str1, String str2)
    {
        if (str1.compareTo(str2) == 0)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }

    public void compareCase (String str1, String str2)
    {
        if (str1.compareToIgnoreCase(str2) == 0)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
    public static void main(String[] args) {

        String str1 = "palash";
        String str2 = "abc";
        String str3 = "zaidi";
        String str4 = "PALASH";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));

        //check if two strings is equal

        System.out.println("Learn Java".compareTo("Learn Java")); // both are same return zero
        System.out.println("Learn Java".compareTo("Learn Iotlin")); // str2 is smaller return 1
        System.out.println("Learn Java".compareTo("Learn Kotlin")); // str1 is bigger return -1
        System.out.println("Learn Java".compareTo("Learn Lotlin")); // str 1 smaller return -2

        System.out.println();
        System.out.println("abc".compareTo("xyz")); // here str1 is bigger alphabetically or comes before in dictionary
        System.out.println("xyz".compareTo("abc")); // here str1 is smaller or comes after in dictionary


        System.out.println();
        System.out.println("abc".compareToIgnoreCase("ABC")); // it will ignore case-sensitive & return 0
        System.out.println("PALASH".compareToIgnoreCase("Palash"));


        CompareStringEx compareStringEx = new CompareStringEx();
        compareStringEx.compareTo(str1, str2); // compare case

        compareStringEx.compareCase(str1,str4); // compare to ignore case

    }
}
