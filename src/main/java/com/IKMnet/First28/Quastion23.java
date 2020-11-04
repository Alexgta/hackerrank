package com.IKMnet.First28;

import java.util.stream.Stream;

class Quastion23C {
    int x = 10;
    int y = 0;
    public int m1() {
        return x  / y;
    }
}

public class Quastion23 {


    public static void main(String[] args) {

        Stream<Quastion23C> s = Stream.of(new Quastion23C(), new Quastion23C());
    //  s.forEach(x -> System.out.println(x.m1()));

        // option A
        /*s.forEach(x ->
            try (x.m1()) {

            } catch (Exception e) {
                System.out.println("Couth it");
            } finally {
                 System.out.println("In finally clause.");
            }
        );*/

        //option B
        /*s.forEach(x ->
            try {
                x.m1();
            } catch (Exception e) {
                System.out.println("Couth it");
            }
        );*/

        //option C
        /*s.forEach(x ->
            try {
                x.m1();
            }
        );*/

        // option D
        s.forEach(x -> {
                try {
                    System.out.println(x.m1());
                } catch (Exception e) {
                    System.out.println("Couth it");
                } finally {
                    System.out.println("In finally clause.");
                }
            }
        );

        //option E
        Stream<Quastion23C> sE = Stream.of(new Quastion23C(), new Quastion23C());
        sE.forEach(x -> {
                try {
                    System.out.println(x.m1());
                } catch (Exception e) {
                    System.out.println("Couth it");
                }
            }
        );
    }
}
