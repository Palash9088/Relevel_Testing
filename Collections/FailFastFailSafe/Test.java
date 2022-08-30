package FailFastFailSafe;//import java.util.*;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(20);
        System.out.println(hashSet);
    }
}
