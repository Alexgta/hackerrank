package com.IKMnet.First28;

public class Quastion13 {

    static class Helper {
        private int data = 5;
        public void bump(int inc) {
            inc++;
            data = data + inc;
        }
    }

    public static void main(String[] args) {
        Helper h = new Helper();
        int data = 2;
        h.bump(data);
        System.out.println(h.data + " " + data);
    }

}