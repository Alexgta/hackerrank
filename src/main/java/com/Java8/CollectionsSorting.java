package com.Java8;

import java.util.*;

class myComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer A1, Integer B2) {
        return -A1 + B2;
    }
}

public class CollectionsSorting {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(0);
        list.add(30);
        list.add(20);
        //Collections.sort(list, new myComparator());
        //Comparator lambdaComp = (Object A, Object B) -> -(int)A + (int)B;

        Collections.sort(list, (a, b) -> -a + b);
        System.out.println(list);

        TreeMap<Integer, String> myMap = new TreeMap<>((a, b) -> -a + b);
        myMap.put(100, "Hundreed");
        myMap.put(200, "Two");
        myMap.put(300, "Three");
        myMap.put(400, "Four");
        System.out.println(myMap);


    }
}
