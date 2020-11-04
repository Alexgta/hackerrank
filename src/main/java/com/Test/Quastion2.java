package com.Test;


import java.util.concurrent.atomic.AtomicInteger;


public class Quastion2 {

    private static final AtomicInteger COUNTER = new AtomicInteger();

    public Quastion2() {
        COUNTER.getAndIncrement();
    }

    public static void main(String[] args) {
        Quastion2 classCount1 = new Quastion2();
        Quastion2 classCount2 = new Quastion2();

        System.out.println(COUNTER);

    }

}
