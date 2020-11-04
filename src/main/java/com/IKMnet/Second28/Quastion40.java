package com.IKMnet.Second28;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

public class Quastion40 {

    public static void main(String[] args) {

        // looking for:      Local time: 15:08:24

        System.out.println(String.format("Local time: %1$tB", Calendar.getInstance()));
        //System.out.println(String.format("Local time: %tT", Calendar.getInstance().toString()));
        System.out.println(String.format("Local time: %tH:%tM:%tS", LocalTime.now(), LocalTime.now(), LocalTime.now()));
        System.out.println(String.format("Local time: %tT", LocalTime.now() ));
        System.out.println(String.format("Local time: %tT", Calendar.getInstance()));

        // System.out.println(String.format("Local time: %s", Calendar.getInstance()));

        Set<String> set = new LinkedHashSet<>();
        set.add("3");
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("3");
        set.add("1");
        set.forEach(s -> System.out.print(s + "-"));

    }

}
