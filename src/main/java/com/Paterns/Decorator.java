package com.Paterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decorator {

    public static void main(String[] arguments) {
        List<String> list = new ArrayList<>();
        list.add("1");
        List<String> decorated = Collections.checkedList(list, String.class);
        decorated.add("2");
        list.add("3");
        System.out.println(list);
        System.out.println(decorated);
    }

}
