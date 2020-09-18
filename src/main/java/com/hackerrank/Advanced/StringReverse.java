package com.hackerrank.Advanced;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        //new StringBuilder(Integer.toString(a)).reverse().toString()
        String reverse = new StringBuilder(A).reverse().toString();
        if (A.equals(reverse))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
