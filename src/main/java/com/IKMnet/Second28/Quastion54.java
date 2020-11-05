package com.IKMnet.Second28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Quastion54 {

    static void populateA(Consumer<String> s, String... stuff) {
        for (int i = 0; i < stuff.length; i++)
            s.accept(stuff[i]);
        System.out.println(s);
    }

    static void populateB(Supplier<List> s, String... stuff) {
        for (int i = 0; i < stuff.length; i++)
            //s.add(stuff[i]);
        System.out.println(s);
    }

    static void populateC(Collection<String> c, String... stuff) {
        for (int i = 0; i < stuff.length; i++)
            c.add(stuff[i]);
        System.out.println(c);
    }

    static void populateD(Supplier s, String... stuff) {
        //List l = s.get();
        for (int i = 0; i < stuff.length; i++)
            //l.add(stuff[i]);
            System.out.println(s);
    }

    static void populateE(Supplier<List> s, String... stuff) {
        List l = s.get();
        for (int i = 0; i < stuff.length; i++)
            l.add(stuff[i]);
            System.out.println(s);
    }




    public static void main(String[] args) {

        Quastion54 mrc = new Quastion54();
        //populateA(ArrayList::new, "Eed", "Green", "Blue");
        //populateB(ArrayList::new, "Eed", "Green", "Blue");
        //populateC(ArrayList::new, "Eed", "Green", "Blue");
        //populateD(ArrayList::new, "Red", "Green", "Blue");
        //populateE(ArrayList::new, "Eed", "Green", "Blue");

    }

}
