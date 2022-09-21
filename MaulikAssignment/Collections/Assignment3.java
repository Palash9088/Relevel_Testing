package Collections;//import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment3 {
/*
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }*/
    public static void main(String[] args) {

        String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
        String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};

        ArrayList<String> nameList1 = new ArrayList<>(Arrays.asList(name1));
        ArrayList<String> nameList2 = new ArrayList<>(Arrays.asList(name2));
        ArrayList<String> finalList = new ArrayList<String>(nameList1);

        // converting to arrays
        Object[] arr = finalList.toArray();
        for(Object arr1 : finalList)
        {
            System.out.println(arr1);
        }

        finalList.addAll(nameList2);
        System.out.println(finalList);

        for (int i=0;i<finalList.size();i++)
        {
            for(int j=i+1;j<finalList.size();j++)
            {
                if(finalList.get(i) == finalList.get(j))
                {
                    finalList.remove(j);
                }
            }
        }
        System.out.println(finalList);
    }
}