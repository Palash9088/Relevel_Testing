public class EqualStrings {
    public static void main(String[] args) {
        String str = "Palash";
        String str2 = "Hello";

        // with equality operator
        System.out.println(str == str2);

        if (str == str2)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }

        /**********************************************************************************************
         *
         ***********************************************************************************************/

        // with inbuilt function

        String name = "Palash";
        String name2 = "Pawan";

        System.out.println(name.equals(name2)); // str.equals(str2) inbuilt function


        // equals with ignore case - it will equal regardless of case

        String s1 = "MILLIONAIRE";
        String s2 = "millionaire";

        if (s1.equalsIgnoreCase(s2))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equals");
        }


    }
}
