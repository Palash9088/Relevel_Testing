package Collections;//import java.util.*;

import java.util.ArrayList;

public class Assignment2 {
    void indexFind(ArrayList<String> names)
    {   int i;
        {
            System.out.print("Techno word index in given arrayList is ");
            for (i = 0; i < names.size(); i++) {
                if (names.get(i).equals("Techno")) {
                    System.out.print(i + ",");
                }
            }
        }
    }
    void replaceElement(ArrayList<String> names)
    {
        for (int i =0;i<names.size();i++) {
            if (names.get(i).equals("Techno"))
            {
                names.set(1, "Credits");
                names.set(3, "Credits");
                names.set(5, "Credits");
            }
        }
        System.out.println("\n"+names);
    }
    void elementCount(ArrayList<String> names)
    {
        int count =0;
        for(int i=0;i<names.size();i++)
        {
            if(names.get(i).contains("Credits"))
            {
                count++;
            }
        }
        System.out.println("Total Credits words :-" + count);
    }

    public static void main(String[] args) {
        Assignment2 assignment2 = new Assignment2();
        ArrayList<String> names = new ArrayList<>();
        names.add("Maulik");
        names.add("Techno");
        names.add("Krishna");
        names.add("Techno");
        names.add("Credits");
        names.add("Techno");

        assignment2.indexFind(names);

        assignment2.replaceElement(names);

        assignment2.elementCount(names);

    }
}
