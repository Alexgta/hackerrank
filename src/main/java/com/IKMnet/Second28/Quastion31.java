package com.IKMnet.Second28;

import java.util.Formatter;

public class Quastion31 {

    public static void main(String[] args) {
        String stringA = "A";
        String stringB = "B";
        String stringNull = null;
        StringBuilder bufferC = new StringBuilder("C");
        Formatter fmt = new Formatter(bufferC);

        fmt.format("%s%s", stringA, stringB);
        System.out.println("Line 1: " + fmt);

        fmt.format("%-1s", stringB);
        System.out.println("Line 2: " + fmt);

        fmt.format("%b", stringNull);
        System.out.println("Line 3: " + fmt);



    }

}
