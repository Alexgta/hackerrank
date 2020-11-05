package com.IKMnet.Second28;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;

public class Quastion50 {
    // ConcurancyExmaple
    private long count;
    private LongAccumulator accum = new LongAccumulator( (x, y) -> x+y, count);
    private AtomicLong countC = new AtomicLong();
    public void incrementCount() {
        //count++;
        //accum.accumulate(1);
        countC.getAndIncrement();
    }
    public long getCount() {
        //return this.count;
        //return accum.get();
        return this.countC.get();
    }

    public static void main(String[] args) {
        final Quastion50 ce = new Quastion50();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ce.incrementCount();
                }
            }, "Thred" + i).start();
        }
        //Thread.sleep(5000);
        System.out.println("Final number: " + ce.getCount());

    }

}
