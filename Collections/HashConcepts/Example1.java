package HashConcepts;//import java.util.*;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {

        HashMap<Integer , String> stdNameRno = new HashMap<>();

        stdNameRno.put(101,"Palash");
        stdNameRno.put(102,"Isha");
        stdNameRno.put(103,"Palak");
        stdNameRno.put(104,"Rahul");
        stdNameRno.put(105,"Parth");

        System.out.println("Key is " + stdNameRno.keySet() + " " + "Value is " + stdNameRno.values());

        System.out.println("---------------------------------------");

        System.out.println(stdNameRno);

        System.out.println("---------------------------------------");

        Iterator<String> itr = stdNameRno.values().iterator();

        while(itr.hasNext())
        {
            String key = itr.next();
            System.out.println(key);
        }
        System.out.println("---------------------------------------");

        for(Map.Entry<Integer,String > entry : stdNameRno.entrySet())
        {
            System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());
        }


//        Map <Integer,String> linkedMap = new TreeMap<>(stdNameRno);

//        System.out.println(linkedMap);
//        System.out.println(linkedMap.keySet());
//        System.out.println(linkedMap.values());


//        for(Integer keys : stdNameRno.keySet())
//        {
//            System.out.println(keys);
//        }
//        for(String str : stdNameRno.values())
//        {
//            System.out.println(str);
//        }

        List<String> stdNameRno1 = new ArrayList<String>();
        stdNameRno1.add("Palash");
        stdNameRno1.add("Isha");
        stdNameRno1.add("Palak");
        stdNameRno1.add("Rahul");
        stdNameRno1.add("Parth");


    }
}
