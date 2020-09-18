package com.hackerrank.Advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class CryptographicHashFunction {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(input.nextLine().getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();

    }

}
