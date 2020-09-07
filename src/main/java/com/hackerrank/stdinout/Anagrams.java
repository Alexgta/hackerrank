package com.hackerrank.stdinout;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String stringA, String stringB) {

        stringA = stringA.toLowerCase();
        stringB = stringB.toLowerCase();

        if (stringA.length() != stringB.length())
            return false;

        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        char theChar;
        for (int i = 0; i < stringA.length(); i++) {
            theChar = stringA.charAt(i);
            if (mapA.containsKey(theChar)) {
                mapA.put(theChar, mapA.get(theChar) + 1);
            } else {
                mapA.put(theChar, 1);
            }
        }

        for (int i = 0; i < stringB.length(); i++) {
            theChar = stringB.charAt(i);
            if (mapB.containsKey(theChar)) {
                mapB.put(theChar, mapB.get(theChar) + 1);
            } else {
                mapB.put(theChar, 1);
            }
        }

        for (Character key : mapA.keySet()) {
            if (!mapB.containsKey(key) || mapA.get(key) != mapB.get(key))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }


}
