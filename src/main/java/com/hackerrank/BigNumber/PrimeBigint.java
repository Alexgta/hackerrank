package com.hackerrank.BigNumber;

import java.util.Scanner;

public class PrimeBigint {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //String n = scanner.nextLine();
        try (Scanner scanner = new Scanner(System.in);)  {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
        scanner.close();

    }

}
