package com.outco.week1;

import java.util.*;

public class w1_d1_frequency_count {

    /**
     *
     * Unique
     *
     * Given an array of integers, return an array with all duplicates removed.*
     *
     * Parameters
     * Input: arr {Array of Integers}
     * Output: {ArrayList of Integers}
     *
     * Constraints
     *
     * Time: O(N)
     * Space: O(N)
     *
     * Examples
     * [1, 2, 4, 4, 5, 6] --> [1, 2, 4, 5, 6]
     * [1, 1, 2, 2, 3, 3]' --> [1, 2, 3]
     * [1, 2, 3, 1, 2] --> [1, 2, 3]
     */

    public static ArrayList<Integer> unique(int[] arr) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int currInt : arr) {
            if (!cache.containsKey(currInt)) {
                result.add(currInt);
                cache.put(currInt, 0);
            }
        }
        return result;
    }

    /**
     * Word Count
     *
     * Given an body of text, return a hash table of the frequency of each word.
     *
     * Parameters
     * Input: sentence {String}
     * Output: {Hash Map <String, Integer>}
     *
     * Constraints
     *
     * Capital and lower case versions of the same word should be counted is the same word.
     *
     * Remove punctuations from all words.
     *
     * Time: O(N)
     * Space: O(N)
     * Where N is the number of characters in the string.
     *
     * **Examples**
     * 'The cat and the hat.' --> '{ the: 2, cat: 1, and: 1, hat: 1 }'`
     * 'As soon as possible.' --> '{ as: 2, soon: 1, possible: 1 }'`
     * 'It's a man, it's a plane, it's superman!' --> '{ its: 3, a: 2, man: 1, plane: 1, superman: 1 }'`
     */

    public static HashMap<String, Integer> wordCount(String sentence) {

        int countStart = 1;
        int countEnd = 0;
        while (countStart != countEnd) {
            countStart = sentence.length();
            sentence = sentence.replace(".", "");
            sentence = sentence.replace("'", "");
            sentence = sentence.replace(",", "");
            sentence = sentence.replace("?", "");
            sentence = sentence.replace("!", "");
            countEnd = sentence.length();
        }

        sentence = sentence.toLowerCase(Locale.ROOT);
        String[] sentenceArr = sentence.split(" ");
        HashMap<String, Integer> result = new HashMap<>();

        for (String curString : sentenceArr) {
            if (result.containsKey(curString)) {
                result.put(curString, result.get(curString) + 1);
            } else {
                result.put(curString, 1);
            }
        }
        return result;
    }


    /**
     * RGB Set
     *
     * Given a string of characters where each character is either 'r', 'g', or 'b',
     * determine the number of complete sets of 'rgb' that can be made with the
     * characters.
     *
     * Parameters
     * Input: str {String}
     * Output: {Integer}
     *
     * Constraints
     * Time: O(N)
     * Space: O(1)
     *
     * Examples
     * `'rgbrgb' --> 2`
     * `'rbgrbrgrgbgrrggbbbbrgrgrgrg' --> 7`
     * `'bbrr' --> 0`
     */

    public static int rgb(String string) {

        if (string.equals(""))
            return 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        Character myChar;
        for (int i = 0; i < string.length(); i++) {
            myChar = string.charAt(i);
            if (hashMap.containsKey(myChar)) {
                hashMap.put(myChar, hashMap.get(myChar) + 1);
            } else {
                hashMap.put(myChar, 1);
            }
        }

        if (!hashMap.containsKey('r') ||
            !hashMap.containsKey('g') ||
            !hashMap.containsKey('b'))
            return 0;

        int count = 2^16;
        if (hashMap.get('r') < count) {
            count = hashMap.get('r');
        }
        if (hashMap.get('g') < count) {
            count = hashMap.get('g');
        }
        if (hashMap.get('b') < count) {
            count = hashMap.get('b');
        }

        return count;
    }

    /**
     * Missing Number
     *
     * Given range of 1 to N and an array of unique integers that are within that
     * range, return the missing integers not found in the array
     *
     * Parameters
     * Input: n {Integer}
     * Input: arr {Array of Integers}
     * Output: {ArrayList of Integers}
     *
     * Constraints
     * Time: O(N)
     * Space: O(N)
     *
     * Examples
     * `4, [1, 4, 2] --> [3]`
     * `8, [4, 7, 1, 6] --> [2, 3, 5, 8]`
     * `6, [6, 4, 2, 1] --> [3, 5]`
     */

    public static ArrayList<Integer> missingNumber(int n, int[] arr) {
        // YOUR WORK HERE
        int indexStart = 2^16;
        for (int i : arr) {
            if (i < indexStart) {
                indexStart = i;
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();

        int[] tempArr = new int[n + 1];

        for (int curValue : arr)
            tempArr[curValue] = 1;

        for (int i = indexStart; i <= n; i++) {
            if (tempArr[i] == 0)
                result.add(i);
        }

        return result;
    }

    /**
     * Letter Sort
     *
     * Given a string of lowercase letters, return the letters in sorted order.
     *
     * Parameters
     * Input: str {String}
     * Output: {String}
     *
     * Constraints
     * Time: O(N)
     * Space: O(N)
     *
     * Examples
     * `hello --> ehllo`
     * `whiteboard --> abdehiortw`
     * `one --> eno`
     */

    public static String letterSort(String string) {

        int[] alphabets = new int[27];

        int curCode;
        for (int i = 0; i < string.length(); i++) {
            alphabets[getCode(string.charAt(i))] = alphabets[getCode(string.charAt(i))] + 1;
        }

        String result = "";
        for (int i = 0; i < 27; i++) {
            if (alphabets[i] > 0) {
                for (int j = 0; j < alphabets[i]; j++)
                    result = result + getChar(i);
            }
        }
        return result;
    }

    private static int getCode(Character pCahr) {

        if (pCahr == 'a') return 0;
        else if (pCahr == 'b') return 1;
        else if (pCahr == 'c') return 2;
        else if (pCahr == 'd') return 3;
        else if (pCahr == 'e') return 4;
        else if (pCahr == 'f') return 5;
        else if (pCahr == 'g') return 6;
        else if (pCahr == 'h') return 7;
        else if (pCahr == 'i') return 8;
        else if (pCahr == 'j') return 9;
        else if (pCahr == 'k') return 0;
        else if (pCahr == 'l') return 11;
        else if (pCahr == 'm') return 12;
        else if (pCahr == 'n') return 13;
        else if (pCahr == 'o') return 14;
        else if (pCahr == 'p') return 15;
        else if (pCahr == 'q') return 16;
        else if (pCahr == 'r') return 17;
        else if (pCahr == 's') return 18;
        else if (pCahr == 't') return 19;
        else if (pCahr == 'u') return 20;
        else if (pCahr == 'v') return 21;
        else if (pCahr == 'w') return 22;
        else if (pCahr == 'x') return 23;
        else if (pCahr == 'y') return 24;
        else if (pCahr == 'z') return 25;
        else return 26;
    }

    private static Character getChar(int pCode) {

        if      (pCode == 0)  return 'a';
        else if (pCode == 1 ) return 'b';
        else if (pCode == 2 ) return 'c';
        else if (pCode == 3 ) return 'd';
        else if (pCode == 4 ) return 'e';
        else if (pCode == 5 ) return 'f';
        else if (pCode == 6 ) return 'g';
        else if (pCode == 7 ) return 'h';
        else if (pCode == 8 ) return 'i';
        else if (pCode == 9 ) return 'j';
        else if (pCode == 10) return 'k';
        else if (pCode == 11) return 'l';
        else if (pCode == 12) return 'm';
        else if (pCode == 13) return 'n';
        else if (pCode == 14) return 'o';
        else if (pCode == 15) return 'p';
        else if (pCode == 16) return 'q';
        else if (pCode == 17) return 'r';
        else if (pCode == 18) return 's';
        else if (pCode == 19) return 't';
        else if (pCode == 20) return 'u';
        else if (pCode == 21) return 'v';
        else if (pCode == 22) return 'w';
        else if (pCode == 23) return 'x';
        else if (pCode == 24) return 'y';
        else if (pCode == 25) return 'z';
        else return                  '-';
    }


    /**
     * Character Mode
     *
     * Given a string, find the most frequent occurring letter(s) in the string
     *
     * Parameters
     * Input: string {String}
     * Output: {String}
     *
     * Constraints
     * If more than one letter is tied for the most frequent, return a string of all
     * the letters in one string.
     *
     * Upper case characters should count as lower case, and do not include spaces
     * ... as characters.
     *
     * Time: O(N)
     * Space: O(N)
     *
     * Examples
     * 'hello' --> 'l'
     * 'A walk in the park' --> 'a'
     * 'noon' --> 'no'
     */

    public static String characterMode(String string) {
        string = string.toLowerCase(Locale.ROOT);
        int countStart = 1;
        int countEnd = 0;
        while (countStart != countEnd) {
            countStart = string.length();
            string = string.replace(" ", "");
            countEnd = string.length();
        }

        HashMap<Character, Integer> countMap = new HashMap<>();
        Character currentChar;
        for (int i = 0; i < string.length(); i++) {
            currentChar = string.charAt(i);
            if (countMap.containsKey(currentChar)) {
                countMap.put(currentChar, countMap.get(currentChar) + 1);
            } else {
                countMap.put(currentChar, 1);
            }
        }

        // lets found maxCount:
        int maxCount = 0;
        String result = "";
        for (Character vChar : countMap.keySet()) {
            if (maxCount == countMap.get(vChar)) {
                result = result + vChar;
            } else if (maxCount < countMap.get(vChar)) {
                maxCount = countMap.get(vChar);
                result = "" + vChar;
            }
        }
        return result;
    }

    /**
     * Sort Digits
     *
     * Given an integer, sort the digits in ascending order and return the new integer.
     * Ignore leading zeros.
     *
     * Parameters
     * Input: num {Integer}
     * Output: {Integer}
     *
     * Constraints
     * Do not convert the integer into a string or other data type.
     *
     * Time: O(N) where N is the number of digits.
     * Space: O(1)
     *
     * Examples
     * 8970 --> 789
     * 32445 --> 23445
     * 10101 --> 111
     */

    public static int sortDigits(int n) {
        // YOUR WORK HERE
        String string = "" + n;
        int[] intString = new int[10];

        int currentInt;
        for (int i = 0; i < string.length(); i++) {
            currentInt = Integer.valueOf("" + string.charAt(i));
            intString[currentInt] = intString[currentInt] + 1;
        }

        String result = "";
        int value;
        for (int i = 1; i < 10; i++) {
            value = intString[i];

            if (value > 0) {
                for (int j = 0; j < value; j++) {
                    result = result + i;
                }
            }
        }
        int intResult = Integer.valueOf(result);
        return intResult;
    }

    /**
     *  Get Duplicates
     *
     *  Given an array of values, return only the values that have duplicates in the
     *  array
     *
     *  Parameters
     *  Input: arr {Array}
     *  Output: {ArrayList}
     *
     *  Constraints
     *  Time: O(N)
     *  Space: O(N)
     *
     *  Examples
     *  [1, 2, 4, 2] --> [2]
     *  [3, 2, 3, 2, 3, 3, 4] --> [3, 2]
     *  [1, 2, 3, 4] --> []
     */

    public static ArrayList<Integer> getDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        LinkedHashMap<Integer, Integer> arrMap = new LinkedHashMap<Integer, Integer>();

        for (int i : arr) {
            if (arrMap.containsKey(i)) arrMap.put(i, arrMap.get(i) + 1);
            else arrMap.put(i, 1);
        }

        for (Integer i : arrMap.keySet()) {
            if (arrMap.get(i) > 1) result.add(i);
        }

        return result;
    }

    /**
     *  Anagram Pair
     *
     *  Given two strings, determine if the strings are anagrams of one another.
     *
     *  Two words are anagrams of one another if they contain the same letters.
     *
     *  Parameters
     *  Input: str1 {String}
     *  Input: str2 {String}
     *  Output: {Boolean}
     *
     *  Constraints
     *  With N as the length of the first string, and M as the length of the second string.
     *
     *  Time: O(N)
     *  Space: O(N)
     *
     *  Examples
     *  "cat", "act" --> true
     *  "cat", "dog" --> false
     *  "racecar", "aaccrres" --> false
     */

    public static boolean anagramPair(String string1, String string2) {
        Map<Character, Integer> string1Map = new HashMap<Character, Integer>();
        Map<Character, Integer> string2Map = new HashMap<Character, Integer>();
        Character currChar;
        for (int i = 0; i < string1.length(); i++) {
            currChar = string1.charAt(i);
            if (string1Map.containsKey(currChar)) string1Map.put(currChar, string1Map.get(currChar) + 1);
            else string1Map.put(currChar, 1);
        }
        for (int i = 0; i < string2.length(); i++) {
            currChar = string2.charAt(i);
            if (string2Map.containsKey(currChar)) string1Map.put(currChar, string2Map.get(currChar) + 1);
            else string2Map.put(currChar, 1);
        }
        if (string1Map.size() != string2Map.size()) return false;
        for (Character testChar : string1Map.keySet()) {
            if (!string2Map.containsKey(testChar) || string1Map.get(testChar) != string2Map.get(testChar))
                return false;
        }

        return true;
    }

    /**
     *  Anagram Palindrome
     *
     *  Given a string, determine if the string can be rearranged to form a palindrome.
     *
     *  A palindrome is a word that is the same as its reversed. For example: "racecar"
     *  and "noon" are palindromes because they match their reversed version
     *  respectively. On the other hand, "cat" is not a palindrome because "cat"
     *  does not equal "tac".
     *
     *  Parameters
     *  Input: str {String}
     *  Output: {Boolean}
     *
     *  Constraints
     *
     *  Assume the string only contains lowercase letters and no spaces.
     *
     *  Time: O(N)
     *  Space: O(1)
     *
     *  Examples
     *  `"racecar" --> true ("racecar" can be rearranged to "racecar")`
     *  `"cat" --> false`
     */

    public static boolean anagramPalindrome(String str) {
        // YOUR WORK HERE
        int length = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i))
                return false;
        }

        return true;
    }
}




////////////////////////////////////////////////////////////
///////////////  DO NOT TOUCH TEST BELOW!!!  ///////////////
////////////////////////////////////////////////////////////

// use the Main class to run the test cases
class Main {
    private int[] testCount;

    // an interface to perform tests
    public interface Test {
        public boolean execute();
    }

    public static void main(String[] args) {

        // instantiate the testing of each module by resetting count and printing title of module
        int[] testCount = {0, 0};
        System.out.println("Unique Tests");

        // tests are in the form as shown
        assertTest(testCount, "should return unique values from sorted list with duplicates", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.unique(new int[]{1, 2, 4, 4, 5, 6});
                ArrayList<Integer> test = new ArrayList<Integer>() {{
                    add(1);
                    add(2);
                    add(4);
                    add(5);
                    add(6);
                }};
                return arrayListsEqual(output, test);
            }
        });

        assertTest(testCount, "should return single value for list with all duplicates", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.unique(new int[]{2, 2, 2, 2, 2, 2});
                ArrayList<Integer> test = new ArrayList<Integer>() {{
                    add(2);
                }};
                return arrayListsEqual(output, test);
            }
        });

        assertTest(testCount, "should return unique values from unsorted list with duplicates", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.unique(new int[]{1,2,3,1,2});
                ArrayList<Integer> test = new ArrayList<Integer>() {{
                    add(1);
                    add(2);
                    add(3);
                }};
                return arrayListsEqual(output, test);
            }
        });

        assertTest(testCount, "should return an empty list from empty input", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.unique(new int[]{});
                ArrayList<Integer> test = new ArrayList<Integer>() {{
                }};
                return arrayListsEqual(output, test);
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");

        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("Word Count Tests");

        // tests are in the form as shown
        assertTest(testCount, "should return an object with each word and its frequency", new Test() {
            public boolean execute() {
                HashMap<String, Integer> output = w1_d1_frequency_count.wordCount("The cat and the hat.");

                return output.get("the").intValue() == 2 && output.get("hat").intValue() == 1 && output.get("cat").intValue() == 1 && output.get("and").intValue() == 1;
            }
        });

        assertTest(testCount, "should return object with each word excluding punctuations", new Test() {
            public boolean execute() {
                HashMap<String, Integer> output = w1_d1_frequency_count.wordCount("It's a man, it's a plane, it's superman!");

                return output.get("its").intValue() == 3 && output.get("a").intValue() == 2 && output.get("man").intValue() == 1 && output.get("plane").intValue() == 1 && output.get("superman").intValue() == 1;
            }
        });

        assertTest(testCount, "should return empty object for empty string input", new Test() {
            public boolean execute() {
                HashMap<String, Integer> output = w1_d1_frequency_count.wordCount("");
                return output.isEmpty();
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("rgb Count Tests");

        // tests are in the form as shown
        assertTest(testCount, "should return number correct number of rgb from input", new Test() {
            public boolean execute() {
                int output = w1_d1_frequency_count.rgb("rgbrgb");
                return output == 2;
            }
        });

        assertTest(testCount, "should return correct number of rgb from input despite characters out of sequence", new Test() {
            public boolean execute() {
                int output = w1_d1_frequency_count.rgb("rbgrbrgrgbgrrggbbbbrgrgrgrg");
                return output == 7;
            }
        });

        assertTest(testCount, "should return 0 as output for no number of rgb", new Test() {
            public boolean execute() {
                int output = w1_d1_frequency_count.rgb("bbrr");
                return output == 0;
            }
        });

        assertTest(testCount, "should return 0 for empty input", new Test() {
            public boolean execute() {
                int output = w1_d1_frequency_count.rgb("");
                return output == 0;
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("Missing Number Tests");

        // tests are in the form as shown
        assertTest(testCount, "should return [3] for input of [1, 4, 2]", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.missingNumber(4, new int[]{1, 4, 2});
                ArrayList<Integer> test = new ArrayList<Integer>() {{
                    add(3);
                }};
                return arrayListsEqual(output, test);
            }
        });


        assertTest(testCount, "should return [2, 3, 5, 8] for input of [4, 7, 1, 6]", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.missingNumber(8, new int[]{4, 7, 1, 6});
                ArrayList<Integer> test = new ArrayList<Integer>() {{
                    add(2);
                    add(3);
                    add(5);
                    add(8);
                }};
                return arrayListsEqual(output, test);
            }
        });

        assertTest(testCount, "should return [3, 5] for input of [6, 4, 2, 1]", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.missingNumber(6, new int[]{6, 4, 2, 1});
                ArrayList<Integer> test = new ArrayList<Integer>() {{
                    add(3);
                    add(5);
                }};
                return arrayListsEqual(output, test);
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("Letter Sort Tests");

        assertTest(testCount, "should return 'ehllo' for input 'hello'", new Test() {
            public boolean execute() {
                String output = w1_d1_frequency_count.letterSort("hello");
                return output.equals("ehllo");
            }
        });

        assertTest(testCount, "should return 'abdehiortw' for input of 'whiteboard'", new Test() {
            public boolean execute() {
                String output = w1_d1_frequency_count.letterSort("whiteboard");
                return output.equals("abdehiortw");
            }
        });

        assertTest(testCount, "should return 'eno' for input 'one'", new Test() {
            public boolean execute() {
                String output = w1_d1_frequency_count.letterSort("one");
                return output.equals("eno");
            }
        });


        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");

        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("Character Mode Tests");

        assertTest(testCount, "should return 'l' for input 'hello'", new Test() {
            public boolean execute() {
                String output = w1_d1_frequency_count.characterMode("hello");
                return output.equals("l");
            }
        });

        assertTest(testCount, "should return 'a' when input is 'A walk in the park'", new Test() {
            public boolean execute() {
                String output = w1_d1_frequency_count.characterMode("A walk in the park");
                return output.equals("a");
            }
        });

        assertTest(testCount, "should return 'no' when input is 'noon'", new Test() {
            public boolean execute() {
                String output = w1_d1_frequency_count.characterMode("noon");
                return output.equals("no");
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");



        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("Sort Digits Tests");

        assertTest(testCount, "should return '789' when input is '8970'", new Test() {
            public boolean execute() {
                int output = w1_d1_frequency_count.sortDigits(8970);
                return output == 789;
            }
        });

        assertTest(testCount, "should return '23445' when input is '32445'", new Test() {
            public boolean execute() {
                int output = w1_d1_frequency_count.sortDigits(32445);
                return output == 23445;
            }
        });

        assertTest(testCount, "should return '111' when input is '10101'", new Test() {
            public boolean execute() {
                int output = w1_d1_frequency_count.sortDigits(10101);
                return output == 111;
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("Get Duplicates Tests");

        assertTest(testCount, "should return '[2]' when input is '[1, 2, 4, 2]'", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.getDuplicates(new int[] {1, 2, 4, 2});
                ArrayList<Integer> test = new ArrayList<Integer>() {{
                    add(2);
                }};
                return arrayListsEqual(output, test);
            }
        });

        assertTest(testCount, "should return '[3, 2]' or '[2, 3]' when input is '[3, 2, 3, 2, 3, 3, 4]'", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.getDuplicates(new int[] {3, 2, 3, 2, 3, 3, 4});
                ArrayList<Integer> test1 = new ArrayList<Integer>() {{
                    add(2);
                    add(3);
                }};

                ArrayList<Integer> test2 = new ArrayList<Integer>() {{
                    add(3);
                    add(2);
                }};
                return arrayListsEqual(output, test1) || arrayListsEqual(output, test2);
            }
        });

        assertTest(testCount, "should return '[]' when input is '[1, 2, 3, 4]'", new Test() {
            public boolean execute() {
                ArrayList<Integer> output = w1_d1_frequency_count.getDuplicates(new int[] {1, 2, 3, 4});
                return output.size() == 0;
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");



        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("Anagram Pair Tests");

        assertTest(testCount, "should return true when input is 'cat, act'", new Test() {
            public boolean execute() {
                return w1_d1_frequency_count.anagramPair("cat", "act");
            }
        });

        assertTest(testCount, "should return false when input is 'cat, dog'", new Test() {
            public boolean execute() {
                return !w1_d1_frequency_count.anagramPair("cat", "dog");
            }
        });

        assertTest(testCount, "should return false when input is 'racecar, aaccrres'", new Test() {
            public boolean execute() {
                return !w1_d1_frequency_count.anagramPair("racecar", "aaccrres");
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");



        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("Anagram Palindrome Tests");

        assertTest(testCount, "should return true when input is 'racecar'", new Test() {
            public boolean execute() {
                return w1_d1_frequency_count.anagramPalindrome("racecar");
            }
        });

        assertTest(testCount, "should return false when input is 'cat'", new Test() {
            public boolean execute() {
                return !w1_d1_frequency_count.anagramPalindrome("cat");
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");
    }

    private static boolean arrayListsEqual(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if(arr1.size() != arr2.size()) {
            return false;
        }

        for(int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) != arr2.get(i)) {
                return false;
            }
        }
        return true;
    }


    // function for checking if arrays are equal
    private static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0 ; i < arr1.length ; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    // checks if array is sorted in linear time
    private static boolean isSorted(int[] input) {
        if (input.length < 2) {
            return true;
        }

        for (int i = 1 ; i < input.length ; i++) {
            if (input[i-1] > input[i]) {
                return false;
            }
        }

        return true;
    }



    // do not edit below, this is to wrap the test and check for exceptions
    private static void assertTest(int[] count, String name, Test test) {
        String pass = "false";
        count[1]++;

        try {
            if (test.execute()) {
                pass = " true";
                count[0]++;
            }
        } catch(Exception e) {}
        String result = "  " + (count[1] + ")   ").substring(0, 5) + pass + " : " + name;
        System.out.println(result);
    }

}
