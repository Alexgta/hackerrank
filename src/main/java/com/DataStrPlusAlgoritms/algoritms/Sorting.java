package com.DataStrPlusAlgoritms.algoritms;


import java.util.List;

public class Sorting {

    public List<Integer> bubbleSorting(List<Integer> list) {
        int tmpValue;
        int tmpIndx = 0;

        // Bubble sort:
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i -1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    tmpValue = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j + 1, tmpValue);
                }
            }
        }
        return list;
    }

    public List<Integer> sekectSorting(List<Integer> list) {
        int tmpValue;
        int tmpIndx = 0;

        for (int i = 0; i < list.size(); i++) {
            tmpValue = 999;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < tmpValue) {
                    tmpValue = list.get(j);
                    tmpIndx = j;
                }
            }
            if (tmpValue < 999) {
                list.set(tmpIndx, list.get(i));
                list.set(i, tmpValue);
            }
        }
        return list;
    }


}
