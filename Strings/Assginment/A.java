package Assginment;//import java.util.*;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {

        String str = "[C5458_childMaterialName2_1659432368980 No 10.9877, C5458_childMaterialName1_1659432368980 No 50]";

        str = str.replace("[","").replace("]","").replace(",","");

        String [] stringArrays2 = str.split("\\s+");

        System.out.println(Arrays.toString(stringArrays2));

    }
}
