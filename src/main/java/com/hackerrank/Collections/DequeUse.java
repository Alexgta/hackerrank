package com.hackerrank.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class DequeUse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> allNumsSet = new ArrayDeque<>();
        HashSet<Integer> uniqSet = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        int remNum;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            allNumsSet.add(num);
            uniqSet.add(num);

            if (allNumsSet.size() > m) {
                remNum = allNumsSet.remove();

                if (!allNumsSet.contains(remNum)) {
                    uniqSet.remove(remNum);
                }
            }

            if (uniqSet.size() > max)
                max = uniqSet.size();


        }
    }

}
