package com.IKMnet.First28;

public class Quastion02 {
    private int data;
    private int data2;

    public Quastion02() {
        this(10);
    }

    public Quastion02(int data) {
        this.data = data;
    }

    public void display() {
        class Decrementer {
            public void decrement() {
                data--;
            }
        }
        Decrementer dec = new Decrementer();
        dec.decrement();
        System.out.println("Data here: " + data);
    }


    public static void main(String[] args) {
        int data = -2;

        Quastion02 quastion02 = new Quastion02();

        System.out.println(quastion02.data);
        System.out.println(quastion02.data2);

    }

}
