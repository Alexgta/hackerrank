package com.IKMnet.First28;

public class Quastion02 {
    public Quastion02() {
        this(10);
    }

    public Quastion02(int data) {
        this.data = data;
    }

    //private int data2;

    public void display() {
        class Decrementer {
            public void decrement() {
                data--;
            }
        }
        Decrementer d = new Decrementer();
        d.decrement();
        System.out.println("Data here: " + data);
    }

    private int data;

    public static void main(String[] args) {
        int data = 0;

        Quastion02 t = new Quastion02();

        t.display();

        System.out.println("data = " + data);
        //System.out.println(quastion02.data2);

    }

}
