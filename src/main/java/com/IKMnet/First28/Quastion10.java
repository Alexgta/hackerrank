package com.IKMnet.First28;

import java.util.Arrays;
import java.util.List;

interface int1 {};
interface int2 extends int1 {};

public class Quastion10 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("dog", "over", "good");

        list.stream().reduce( (x1, x2) -> x1.length() > x2.length() ? x1 : x2).ifPresent(System.out :: println);
        list.stream().reduce( (x1, x2) -> x1.length() == 3 ? x1 : x2).ifPresent(System.out :: println);

        System.out.println(list.stream().reduce(new String(), (s1, s2) -> s1 + s2.charAt(0), (c1, c2) -> c1 += c2));
        System.out.println(list.stream().reduce(new String(), (s1, s2) -> {if (s1.equals("dog")) return s1; return s2;}));
        //System.out.println(myList.stream().reduce(new Character(), (Character s1, s2) -> s1 + s2.charAt(0), (c1, c2) -> c1 += c2));


        /*List<Integer> intList = Arrays.asList(5, 6, 7);
        //System.out.println(intList.stream().reduce(3, (s1, s2) -> s1 * s2)); //, (left, right) -> left * right));
        int computedAges = intList.parallelStream().reduce(0, (a, b) -> a + b); /// , Integer::sum
        System.out.println(intList);
        System.out.println(computedAges);*/

        /*List<String> quastion34 = Arrays.asList("AAA", "BBB", "CCC");
        System.out.println(quastion34.stream().findFirst());*/

    }





}
