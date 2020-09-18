package com.hackerrank.Advanced;

public class SubstringComparisons {

    //public static String getSmallestAndLargest(String s, int k) {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        String smallest = s.substring(0,k);
        String largest = "a";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String temp;
        for (int i = 0; i < s.length() - k + 1; i++) {
            temp = s.substring(i, i + k);
            if (temp.compareTo(smallest) < 0)
                smallest = temp;
            if (temp.compareTo(largest) > 0)
                largest = temp;
        }

        //return smallest + "\n" + largest;
        System.out.println(smallest);
        System.out.println(largest);
    }

}
