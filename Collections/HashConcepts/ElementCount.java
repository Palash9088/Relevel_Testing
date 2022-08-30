package HashConcepts;//import java.util.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class ElementCount {

    static void countChar(String str)
    {
        char [] arr = str.toCharArray();
        Map<Character, Integer> mapChar = new LinkedHashMap<>();

        for(char ch : arr){
            System.out.print(ch);
            if(mapChar.containsKey(ch))
            {
                mapChar.put(ch, mapChar.get(ch)+1); //mapChar.put(ch, count+1);
            }
            else
            {
                mapChar.put(ch,1);
            }
        }
        System.out.println(mapChar);
    }
    public static void main(String[] args) {
        countChar("releveleducation");




        /* int count = 0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == 'i')
            {
                count++;
            }
        }
        System.out.println("Count of i is : " + count);*/
    }
}
