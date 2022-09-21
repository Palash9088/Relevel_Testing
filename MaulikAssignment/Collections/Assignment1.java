package Collections;//import java.util.*;

import java.util.ArrayList;
public class Assignment1 {
    static void stringElementRemove(ArrayList <String> names, String element) {
        for (int i = 0; i < names.size(); i++) {
            names.remove(element);

        }
        System.out.println("Modified list " + names);
    }
    static void integerElementRemove(ArrayList <Integer> intList, int element) {
        for (int i = 0; i < intList.size(); i++) {
            intList.remove(element);

        }
        System.out.println("Modified list " + intList);
    }

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Maulik");
        name.add("Techno");
        name.add("Krishna");
        name.add("Techno");
        name.add("Credits");
        name.add("Techno");

        System.out.println("Original List " + name);
        stringElementRemove(name,"Techno");

        System.out.println("---------------------------------------------");

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(8);

        System.out.println("Original List " + integerArrayList);
        integerArrayList.remove(3);



    }
}
