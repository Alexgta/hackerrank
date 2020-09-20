package com.hackerrank.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNumberString {

    public static void main(String[] args) {
        String myString = "123434123";
        String myString2 = "asdd fdsf";

        String ptr = "^[a-z]+$"; // "^[0-9]+$";  "^\\d+$";
        Pattern pattern = Pattern.compile(ptr);
        Matcher matcher = pattern.matcher(myString2);

        if (matcher.find()) {
            System.out.println("Yes, we found one");
        } else {
            System.out.println("No, we don't have any");
        }

    }

}
