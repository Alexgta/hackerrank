package com.IKMnet.Second28;

import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;

interface MonthDayHealper {
    default MonthDay construct (Month month, int dayOfMonth) {
        return MonthDay.of(month, dayOfMonth);
    }
    static String toString(MonthDay monthDay) {
        return monthDay.getMonth().toString() + " " + monthDay.getDayOfMonth();
    }
}

interface LocalTimeHelper {
    default LocalTime construct(int hour, int minute, int seconds) {
        return LocalTime.of(hour, minute, seconds);
    }
    static String toString (LocalTime localTime) {
        return localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond();
    }
}

public class Quastion49 implements MonthDayHealper, LocalTimeHelper {
    private MonthDay monthDay;
    private LocalTime localTime;

    Quastion49(Month month, int dayOfMoth, int hours, int minutes, int secounds) {
        // v2
        /*System.out.println(MonthDayHealper.toString(monthDay));
        System.out.println(" " + LocalTimeHelper.toString(localTime));*/

        // v3
        monthDay = MonthDayHealper.super.construct(month, dayOfMoth);
        localTime = LocalTimeHelper.super.construct(hours, minutes, secounds);

        // v4
        /*monthDay = super.construct(month, dayOfMoth);
        localTime = super.construct(hours, minutes, secounds);*/
    }

    void print() {
        // v1
        /*System.out.println(toString(monthDay));
        System.out.println(" " + toString(localTime));*/

        // v5
        System.out.print(MonthDayHealper.toString(monthDay));
        System.out.println(" " + LocalTimeHelper.toString(localTime));

    }

    public static void main(String[] args) {
        Quastion49 dt1 = new Quastion49(Month.OCTOBER, 31, 12,  5, 30);
        Quastion49 dt2 = new Quastion49(Month.OCTOBER,  1,  5, 14, 25);
        dt1.print();
        dt2.print();
    }
}
