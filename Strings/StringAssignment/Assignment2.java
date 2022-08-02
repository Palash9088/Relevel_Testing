package StringAssignment;//import java.util.*;

import java.util.Arrays;

public class Assignment2 {
    void m1 (String str1)
    {
        str1.replaceAll(" ","");
        System.out.println(str1);

        char [] arr = str1.toCharArray();

        Arrays.sort(arr);

    }
    public static void main(String[] args) {

        Assignment2 obj = new Assignment2();

        obj.m1("the quick brown fox jumps over the lazy dog");


    }
}
