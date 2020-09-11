package com.hackerrank.regEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            Pattern thePattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher theMatcher = thePattern.matcher(line);
            boolean found = false;
            while (theMatcher.find()) {
                System.out.println(theMatcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }

            testCases--;
        }
    }


}
