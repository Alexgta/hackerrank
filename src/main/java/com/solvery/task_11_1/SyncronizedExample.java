package com.solvery.task_11_1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SyncronizedExample {

    public static void main(String[] args) throws InterruptedException {
        AtomicReference<Integer> countB = new AtomicReference<>(0);
        Thread thread3 = new Thread(
            () -> {
                synchronized (countB) {
                    for (int i = 0; i < 1000; i++) {
                        countB.getAndSet(countB.get() + 1);
                    }
                }
            }
        );

        Thread thread4 = new Thread(
                () -> {
                    synchronized (countB) {
                        for (int i = 0; i < 1000; i++) {
                            countB.getAndSet(countB.get() + 1);
                        }
                    }
                }
        );

        thread3.start();
        thread4.start();
        int count3 = 0;
        while (thread3.isAlive() || thread4.isAlive()) {
            Thread.sleep(10);
        }
        System.out.println("Synchronized result (should be 2000): " + countB.get());


        // not synchronized, doesn't work correctly:
        AtomicInteger count = new AtomicInteger();
        Thread thread1 = new Thread(
            () -> {
                for (int i = 0; i < 1000; i++) {
                    count.set(count.get() + 1);

                }
            }
        );

        Thread thread2 = new Thread(
            () -> {
                for (int i = 0; i < 1000; i++) {
                    count.set(count.get() + 1);
                }
            }
        );

        thread1.start();
        thread2.start();
        int count2 = 0;
        while (thread1.isAlive() || thread2.isAlive()) {
            Thread.sleep(10);
        }
        System.out.println("Not synchronized result (should be < 2000): " + count.get());
    }

}
