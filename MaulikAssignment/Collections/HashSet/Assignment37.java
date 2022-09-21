package Collections.HashSet;//import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Assignment37 {
    public static void main(String[] args) {

        String str [] = {"Hi","Globant","techno", "Hi", "Hello", "Globant", "techno", "techno", "Globant", "techno"};

        ArrayList <String> arrayList = new ArrayList<String>(Arrays.asList(str));
        System.out.println(arrayList);

        HashMap <String,Integer> hashMap = new HashMap<>();

        int maxValue = 0;

        for(String name : arrayList)
        {
            if(hashMap.containsKey(name))
            {
                hashMap.put(name,hashMap.get(name)+1);
            }
            else
            {
                hashMap.put(name,1);
            }

        }
        System.out.println(hashMap.keySet() +" " + hashMap.values());

        System.out.println("Maximum repeated word is " + Collections.max(hashMap.keySet()) + " having frequency" + Collections.max(hashMap.values()));
    }
}
