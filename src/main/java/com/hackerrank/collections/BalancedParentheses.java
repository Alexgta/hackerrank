package com.hackerrank.collections;

import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {
        String parString = "[]{}([]{})";

        // by one line:
        //while(parString.length() != (parString = parString.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());

        int lengthStart = parString.length();
        int lengthEnd = 0;

        while (lengthStart != lengthEnd) {
            lengthStart = parString.length();
            parString = parString.replaceAll("\\[\\]", "");
            parString = parString.replaceAll("\\{\\}", "");
            parString = parString.replaceAll("\\(\\)", "");

            lengthEnd = parString.length();
        }

        System.out.println(parString.isEmpty());


    }


}
