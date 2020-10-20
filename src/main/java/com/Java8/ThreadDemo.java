package com.Java8;

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable rnbl = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child i = " + i);
            }
        };

        Thread thread = new Thread(rnbl);
        thread.start();

        for (int i = 0; i < 10; i++)
            System.out.println("Main i= " + i);
    }

}
