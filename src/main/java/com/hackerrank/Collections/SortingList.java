package com.hackerrank.Collections;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(20);
        myList.add(1);
        myList.add(10);
        myList.add(15);

        System.out.println(myList);
        Collections.sort(myList, (a, b) -> -a + b);
        System.out.println(myList);

    }

}
