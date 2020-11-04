package com.Paterns;

public class Protptype {
    // clone objects.

    public static void main(String[] args) {
        class CloneObject implements Cloneable {
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return new CloneObject();
            }
        }
        CloneObject obj = new CloneObject();
        try {
            CloneObject pattern = (CloneObject) obj.clone();
        } catch (CloneNotSupportedException e) {
            //Do something
        }
    }

}
