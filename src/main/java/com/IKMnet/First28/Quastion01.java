package com.IKMnet.First28;

import java.util.SortedSet;
import java.util.TreeSet;

public class Quastion01 {

    public static void main(String[] args) {
        SortedSet<Element> s = new TreeSet<Element>();
        s.add(new Element(15));
        s.add(new Element(10));
        s.add(new Element(25));
        s.add(new Element(15));
        s.add(new Element(25));

        System.out.println(s.first() + " " + s.size());


    }

    static class Element implements Comparable {
        int id;

        public Element(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(Object o) {
            Element e = (Element) o;
            return this.id - e.id;
        }

        @Override
        public String toString() {
            return "" + this.id;
        }
    }


}
