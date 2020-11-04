package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class A {

    static final List<String> CALLED_FROM_LIST = new ArrayList<>();

    public A() {

        try {
            throw new Exception("Write trace");
        } catch( Exception e ) {

            String report = String.format("%s was called from %s.%s",
                    this.getClass().getName(),
                    e.getStackTrace()[1].getClassName(),
                    e.getStackTrace()[1].getMethodName());
            CALLED_FROM_LIST.add(report);
        }
    }
}

class B {
    A a;
    public B() {
        a = new A();
    }

    /*public B() {
        System.out.println("B-A: " + (this instanceof A));
        System.out.println("B-B: " + (this instanceof B));
        System.out.println("B This.getClass" + this.getClass());
    }*/

    /*public C(String wereWerun) {

        if (classesList.containsKey("C")) {

            List weHave = classesList.get("C");
            weHave.add(wereWerun);
            classesList.put("C", weHave);

        } else {
            List weHave = new ArrayList();
            weHave.add(wereWerun);
            classesList.put("C", weHave);
        }
    }*/
}

public class Quastion3 extends A {

    public Quastion3() {

        /*if (classesList.containsKey("Quastion3")) {
            int count = classesList.get("Quastion3");
            classesList.put("Quastion3", count + 1);
        } else {
            classesList.put("Quastion3", 1);
        }*/
    }

    public static void main(String[] args) {
        B b = new B();
        Quastion3 quastion3a = new Quastion3();
        /*
        Quastion3 quastion3b = new Quastion3();
        A a = new A();*/

        for (String a : A.CALLED_FROM_LIST) {
            System.out.println(a);
        }

    }

}
