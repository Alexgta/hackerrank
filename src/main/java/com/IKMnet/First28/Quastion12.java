package com.IKMnet.First28;

public class Quastion12 {

    public static void main(String[] args) {
        Integer x = 3;
        Integer y = null;

        try {
            System.out.println(Integer.compareUnsigned(x, 3) == 0 || Integer.compareUnsigned(y, 0) == 0);
        } catch (Exception ex) {
            System.out.println(ex.getClass().toString());
        }

        try {
            System.out.println(Integer.compareUnsigned(y, 0) == 0 || true);
        } catch (Exception ex) {
            System.out.println(ex.getClass().toString());
        }


    }

}
