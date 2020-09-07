package com.hackerrank.stdinout;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrancyFormat {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();*/

        double payment = 12.23;

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);



        // Write your code here.

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }

}
