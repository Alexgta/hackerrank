package com.IKMnet.Second28;

import java.util.ArrayList;
import java.util.List;

public class Quastion46 {
    public List<String> queueSequence;
    public void setup() {
        try {
            establishQueueSequence();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally { cleanupSequence();
            System.out.println("Queue sequence successfully cleaned up");
        }
    }
    private void cleanupSequence() {
        if (queueSequence.size() > 0) {System.out.println("Queue size > 0"); }
    }
    private void establishQueueSequence() throws IllegalAccessException {
        if (true) {
            throw new IllegalAccessException();
        }
        queueSequence = new ArrayList<String>();
    }
    public static void main(String[] args) {
        Quastion46 processor = new Quastion46();
        processor.setup();
        System.out.println("Processor compleet");
    }

}
