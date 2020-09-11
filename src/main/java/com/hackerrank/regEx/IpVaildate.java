package com.hackerrank.regEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IpVaildate {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

}

class MyRegex {
    //String from0To255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
    String from0To255 = "(25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|[0-9][0-9]|[0-9])";
    public String pattern = String.format("%s.%s.%s.%s", from0To255, from0To255, from0To255, from0To255);
}
