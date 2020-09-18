package com.hackerrank.RegEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternValidate {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0) {
            --testCases;
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern thePattern = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }

        }
    }

}
