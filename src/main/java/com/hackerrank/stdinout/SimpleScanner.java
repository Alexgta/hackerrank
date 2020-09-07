package com.hackerrank.stdinout;

import java.util.Scanner;

public class SimpleScanner {

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
        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }


    public void checkType() {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0; i < t; i++) {
            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

    }


    public void readFewLines() {
        // read and print int, double, String
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.next();
        String c = scan.next();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    //public static void main(String[] args) {
    public void printSome() {
        // using   System.out.format
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x = sc.nextInt();
            System.out.format("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }



}
