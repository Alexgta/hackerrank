package com.hackerrank.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraylistExample {

    /*

    The first line has an integer n.
    In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
    In the next line there will be an integer  denoting number of queries.
    Each query will consist of two integers x and y.

    */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>(n);
        for (int i = 0; i < n; i++) {
            s = sc.nextLine();
            a.add(i, new ArrayList<String>(Arrays.asList(s.split("\\s"))));
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= a.size() && y < a.get(x-1).size() && y >= 0) {
                System.out.println(a.get(x-1).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }

}
