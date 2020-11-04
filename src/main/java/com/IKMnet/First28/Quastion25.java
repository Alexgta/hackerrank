package com.IKMnet.First28;

import java.math.BigDecimal;

interface Quastion25Account {
    BigDecimal balance = new BigDecimal(0.00);
}

public class Quastion25 implements Quastion25Account {
    BigDecimal balance2;
    public Quastion25 (BigDecimal value) {
        //balance = value;   - will generate compilation error.
        balance2 = value;
    }

    public String toString() {
        return balance2.toString();
    }

    public static void main(String[] args) {
        Quastion25 instance = new Quastion25(new BigDecimal(50.00));
        System.out.println(instance);
    }



}
