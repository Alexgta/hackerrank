package com.IKMnet.First28;

class ClassA {
    String strA;

    public ClassA() {
        System.out.println("");
        System.out.println("ClassA countstructor");
        strA = "strA";
    }
}

class ClassB extends ClassA{
    String strB;
    public ClassB() {
        super();
        strA = "str B1";
        String strB = "Yes: B";
        System.out.println(" B countstructor " + strA);
    }

    public ClassB(String str) {
        super();
        //this();       Error. You can't have super() and this() in one black. It's should be 1-t line
        strA = str;
        String strB = "Yes: B-2";
        System.out.println(" B2 countstructor " + strA);
    }

    public String getStrB() {
        //super();          Error.
        //this();               Error.
        return strB;
    }
}

public class Quastion08 {

    public static void main(String[] args) {
        ClassB classB = new ClassB("Hey");

    }


}
