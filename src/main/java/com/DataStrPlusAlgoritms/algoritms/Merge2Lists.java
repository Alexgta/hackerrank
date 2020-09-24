package com.DataStrPlusAlgoritms.algoritms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Merge2Lists {
    private int test;

    public List<Integer> mergeIt(List<Integer> list1, List<Integer> list2) {
        boolean run = true;
        List<Integer> result = new ArrayList();
        int indx1 = 0;
        int indx2 = 0;

        while (run) {

            //System.out.println("indx1: " + indx1 + ", indx2: " + indx2);
            if (indx1 >= list1.size() - 1 && indx2 >= list2.size() - 1) {
                run = false;
                break;
            }

            if (indx1 >= list1.size() - 1) {
                result.add(list2.get(indx2));
                indx2++;
                continue;
            }

            if (indx2 >= list2.size() - 1) {
                result.add(list1.get(indx1));
                indx1++;
                continue;
            }

            if (list1.get(indx1) < list2.get(indx2)) {
                result.add(list1.get(indx1));
                indx1++;
            } else {
                result.add(list2.get(indx2));
                indx2++;
            }

        }

        for (Integer value : result) {
            System.out.println("New value: " + value);
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 6, 8, 3, 12, 15, 15, 24, 42);

        HashMap<Integer, Integer> map = new HashMap<>();


        for (Integer vInt : list) {
            if (map.containsKey(vInt)) {
                System.out.println("First value: "  + vInt);
                break;
            } else {
                map.put(vInt, vInt);
            }
        }

        System.out.println("Happy?");


    }


}
