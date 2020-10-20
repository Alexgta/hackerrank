package com.Java8;

import java.time.LocalDateTime;

public class DateTimeTest {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getMonth());
    }

}
