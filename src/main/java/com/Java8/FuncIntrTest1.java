package com.Java8;


public class FuncIntrTest1 {

    interface Interf1 {
        public void m1();
    }

    interface Interf2 {
        public void add(int a, int b);
    }

    interface Interf3 {
        public void theLength(String s);
    }

    public static void main(String[] args) {
        /*Interf1 i = () -> System.out.println("Lambda expr emplamentation");
        i.m1();

        Interf2 j = (a, b) -> System.out.println("Summa: " + (a + b));
        j.add(10, 20); */

        Interf3 d = s -> System.out.println("Length: " + s.length());
        d.theLength("Hell world");

    }

}
