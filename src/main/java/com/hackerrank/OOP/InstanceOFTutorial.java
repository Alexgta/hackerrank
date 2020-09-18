package com.hackerrank.OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Student03 { }
class Rockstar03 { }
class Hacker03 { }


public class InstanceOFTutorial {

    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(element instanceof Student03)
            a++;
            if(element instanceof Rockstar03)
            b++;
            if(element instanceof Hacker03)
            c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student03());
            if(s.equals("Rockstar"))mylist.add(new Rockstar03());
            if(s.equals("Hacker"))mylist.add(new Hacker03());
        }
        System.out.println(count(mylist));
    }

}
