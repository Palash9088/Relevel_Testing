package StringAssignment;//import java.util.*;

import java.util.Arrays;

public class Assignment1 {

    void m1 (String str1, String str2)
    {
        char [] arr1 =  str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result = Arrays.equals(arr1,arr2);
        if (result == true)
        {
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Assignment1 assignment1 = new Assignment1();

        assignment1.m1("race","care");

    }
}
