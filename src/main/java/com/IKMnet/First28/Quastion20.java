package com.IKMnet.First28;

public class Quastion20 {

    public static void main(String[] args) {
        Long l1 = new Long(123);
        Long l2 = l1;
        Long l3 = l1;
        if (l1 == l2) {
            System.out.println("Equal Objects");
            System.out.println(l1);
            System.out.println(l2);
        }
        else System.out.println("Not equal Objects");

        l1++;
        if (l1 == l2) System.out.println("Equal Objects");
        else {
            System.out.println("Not equal Objects");
            if (l3 == l1) System.out.println("l3 = l1");
            if (l3 == l2) System.out.println("l3 = l2");
        }

    }

}
