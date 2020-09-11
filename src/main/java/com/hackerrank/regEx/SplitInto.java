package com.hackerrank.regEx;

import java.util.Scanner;

public class SplitInto {

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        String theString = scan.nextLine();
        scan.close();*/

        String s = "This is an example's str_ing, right?  Yes! e@mail.ru";

        if (s.trim().length()==0 || s.trim().length()>400000) {
            System.out.println(0);
            return;
        }

        String words[]=s.trim().split("[ !,?.\\_'@]+");
        System.out.println(words.length);
        for (String word : words)
            System.out.println(word);


    }


}
