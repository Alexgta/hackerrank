package com.IKMnet.First28;

import java.util.Optional;

public class Quastion14 {

    @Override
    public String toString() {
        return "ObjectDemo";
    }

    public static void main(String[] args) {
        Optional<Object> o = Optional.of(new Quastion14());
        System.out.println(o.get().toString());
    }

}
