package com.hackerrank.BigNumber;

public class Test {

    public static void main(String[] args) {
        int n = 171;

        Boolean result = true;
        for (int i = 2; i < n ; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}
