public class SubStrings {
    public static void main(String[] args) {

       String s1  = "This is Exercise 1";
       String s2  = "This is Exercise 2";


       if (s1.equals(s2))
       {
           System.out.println("both are equals");
       }
       else
       {
           System.out.println(s1 + " is less than " + s2);
       }

        String s3  = "PHP Exercises and ";
        String s4 =  "Python Exercises";

        System.out.println("Concatenated string is " + s3.concat(s4));

        String s5 = "PHP Exercises and Python Exercises";
        String s6 = "and";
        System.out.println("Original string : " + s5);
        System.out.println("Specified sequence of char value " + s6);
        System.out.println(s5.contains(s6));

        String str1 = "example.com ";
        String str2 = "Example.com ";
        CharSequence cs = "example.com ";

        System.out.println(str1 + " and " + cs + str1.contentEquals(cs));
        System.out.println(str2 + "and " + cs + str2.contentEquals(cs));


        StringBuffer sb = new StringBuffer("example.com ");

        System.out.println(str1 + "and " + sb + str1.contentEquals(sb));
        System.out.println(str2 + "and " + sb + str1.contentEquals(sb));

        char arr[] = new char[] {'1','2','3','4'};

        String str = String.copyValueOf(arr,1,3);

        System.out.println("\nThis book contain " + str + " pages.\n");

        String str10 = "PythonExercises";
        String str11 = "PythonExercise";
        String str12 = "se";

        System.out.println(str10 + " ends with ses " + str10.endsWith(str12));
        System.out.println(str11 + " ends with se " + str11.endsWith("se"));

        String str1212 = "Stephen Edwin King";
        String str1213 = "Walter Winchell";
        String str1214 = "Mike Ryoko";

        System.out.println("\"" + str1212 + "\"" + " equals " + "\"" + str1213+ "\" " + str1212.contains(str1213) );


    }
}
