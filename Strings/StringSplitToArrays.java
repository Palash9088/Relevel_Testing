import java.util.Arrays;

public class StringSplitToArrays {
    public static void main(String[] args) {

        /************************************************
         *  1. Use of new character for a string
         *
         ************************************************/

        //1. create a string new keyword
        String name = "Java String";

        // to print java string
        System.out.println(name);
        System.out.println("------------------------------------------------------------------------------------------");

        /*
        -----------------------------------------------------------------------------------------------
         */

        // Split String program

        // 1. if we have taken "" only double quotes then it will break into letter substring

        String str1 = new String ("Hello world this is string split program");

        String [] stringArrays1 = str1.split("");

        System.out.println(Arrays.toString(stringArrays1));

        System.out.println("------------------------------------------------------------------------------------------");

        // 2. if we have taken space between double " "  then it will break into word by word from whitespace

        String str2 = new String ("Hello world this is string split     program,Hello world this is string split program");

        String [] stringArrays2 = str2.split(" ");

        System.out.println(Arrays.toString(stringArrays2));
        String [] stringArraysWithRegex = str2.split("\\s+");
        System.out.println(Arrays.toString(stringArraysWithRegex));

        System.out.println("------------------------------------------------------------------------------------------");

        // 3. if we have taken "i"  then it will break from i into substring

        String str3 = new String ("Hello world this is string split program");

        String [] stringArrays3 = str3.split("i");

        System.out.println(Arrays.toString(stringArrays3));

        System.out.println("------------------------------------------------------------------------------------------");

        // 4. if we have taken "s"  then it will break from s into substring

        String str4 = new String ("Hello world this is string split program");

        String [] stringArrays4 = str4.split("s");

        System.out.println(Arrays.toString(stringArrays4));

        System.out.println("------------------------------------------------------------------------------------------");

    }
}
