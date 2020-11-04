package com.IKMnet.Second28;

class Parent {
    protected static int count = 0;
    public Parent() {count++;};

    public static int getCount() {
        return count;
    }
}

public class Quastion32 extends Parent {
    public Quastion32() {count++;}

    public static void main(String[] args) {
        System.out.println("Count= " + getCount());
        Quastion32 obj = new Quastion32();
        System.out.println("Count = " + getCount());
    }


}
