package com.hackerrank.stdinout;

import java.util.Scanner;

public class ThrowStException {

    //Write your code here
    static boolean flag = true;
    static int B,H;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        String s = Integer.toString(n);

        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }


}
