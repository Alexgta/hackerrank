package com.hackerrank.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student01 implements Comparable {
    private int id;
    private String fname;
    private double cgpa;
    public Student01(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    //@Override
    public int compareTo(Object o){
        Student01 s=(Student01)o;
        if(this.cgpa != s.getCgpa()) {
            if (this.cgpa > s.getCgpa()) {
                return -1;
            } else
                return 1;
        } else {
            if(this.fname.equals(s.getFname())){
                return this.id - s.getId();
            } else {
                return this.fname.compareTo(s.getFname());
            }
        }
    }
    
}


public class SortList {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student01> studentList = new ArrayList<Student01>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student01 st = new Student01(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for(Student01 st: studentList){
            System.out.println(st.getFname());
        }

/*      https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int k=scan.nextInt();
        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=str.length()-k;i++){
            sets.add(str.substring(i,i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());*/


    }

}
