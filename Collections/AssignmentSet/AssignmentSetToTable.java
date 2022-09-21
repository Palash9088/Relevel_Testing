package AssignmentSet;//import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class AssignmentSetToTable {
    public static void main(String[] args) {

        TreeSet <String> empTreeSet = new TreeSet<String>();
        empTreeSet.add("Palash");
        empTreeSet.add("Rahul");
        empTreeSet.add("Mark");
        empTreeSet.add("Angeline");
        empTreeSet.add("Ankur");


        //To check if name present in set or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to continue");
        String name = scanner.nextLine();
        for(String str : empTreeSet)
        {
            if(str.contains(name))
            {
                System.out.println("Given name " + name +  " is present in the TreeSet");
            }
            else {
                System.out.println("Given name " + name +  " is not present in the TreeSet");
            }
            break;
        }



        // To convert into HashTable

        HashMap<String, Integer> empHashMap = new HashMap<String, Integer>();

        for(String emp : empTreeSet)
        {
            empHashMap.put(emp,emp.length());
        }

        for (Map.Entry<String,Integer> entry : empHashMap.entrySet())
        {
            System.out.print("Key is " + empHashMap.keySet() + " " +  "Value is " + empHashMap.values());
            break;
        }
    }
}
