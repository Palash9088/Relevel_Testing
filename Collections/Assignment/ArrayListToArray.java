package Assignment;//import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
        String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};

        ArrayList<String> nameList1 = new ArrayList<>(Arrays.asList(name1));
        ArrayList<String> nameList2 = new ArrayList<>(Arrays.asList(name2));
        ArrayList<String> finalList = new ArrayList<String>(nameList1);
        finalList.addAll(nameList2);
        System.out.println( "In Array List " + finalList);

        // converting to arrays
        Object[] arr = finalList.toArray();
        System.out.println("In Arrays ");
        for(Object arr1 : finalList)
        {
            System.out.println(arr1);
        }

    }
}
