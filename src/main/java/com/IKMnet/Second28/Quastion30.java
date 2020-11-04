package com.IKMnet.Second28;

import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class Quastion30 {

    public static void main(String[] args) {
        YearMonth ym1 = YearMonth.of(2015, Month.SEPTEMBER);
        YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);

        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));
        //System.out.println(ym1.minus(Period.ofMonths(4).getMonthValue()));
        System.out.println(ym1.minus(Period.ofMonths(4)));
        //System.out.println(ym1.until(ym2));
        System.out.println(ym2.until(ym1, ChronoUnit.MONTHS));
        System.out.println(ym1.compareTo(ym2));

    }

}
