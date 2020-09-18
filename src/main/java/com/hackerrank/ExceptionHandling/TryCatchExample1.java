package com.hackerrank.ExceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            scan.close();
            System.out.println( a / b);
        } catch (InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ex) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

    }

}
