package com.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public boolean checkStrCharsForUniques(String testString) {
        // 1.9
        //return new HashSet<Character>(List.of(testString.toCharacher)).size == testString.lenght();

        // 1.8
        return testString.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == testString.length();
    }

    public boolean checkStrCharsForUniques1(String testStr) {
        boolean result = true;

        Map<Character, Integer> testStrMap = new HashMap();
        // we can use map value Integer as a count for more complicated cases.
        //new HashSet<Character>(List.of(testStr.toCharacher)).size == testStr.length();

        int testStrLength = testStr.length();
        Character currChar;
        for (int i = 0; i < testStrLength; i++) {
            currChar = testStr.charAt(i);
            if (testStrMap.containsKey(currChar)) {
                result = false;
                break;
            }
            testStrMap.put(currChar, 0);
        }
        return result;
    }

    public boolean checkStrCharsForUniques2(String testStr) {
        boolean result = true;

        Set<Character> testStrSet = new HashSet<>();
        int testStrLength = testStr.length();
        Character currChar;
        for (int i = 0; i < testStrLength; i++) {
            currChar = testStr.charAt(i);
            testStrSet.add(currChar);

            if (testStrSet.size() < i + 1) {
                result = false;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        String testString = "abcdef g";

        System.out.println(testString.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == testString.length());

        /*List<Character> chars = Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u', 'y'});
        Set<Character> charSet = new HashSet<>(chars);

        Character[] ch = new Character[] {'a', 'e', 'i', 'o', 'u', 'y'};
        Set<Character> set = Arrays.stream(ch).collect(Collectors.toSet());

        Set<Character> testSet = testString.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        char[] testChArray = testString.toCharArray();
        Character[] testChArray2 = {'1', '2', '1', '2', '4'};


        List<Character> chars2 = Arrays.asList();


        Set<Character> testSet = new HashSet<>(testChArray2);
                //new HashSet<>(Arrays.asList(testArray));
        Character[] testArr = {'a', 'b', 'c', 'a'};
        Collections.addAll(testSet, testArr); */

        System.out.println("hey");

    }


}
