package com.Test;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

import java.util.*;

public class Test4 {

    public static void main(String[] args) {

        Integer[] i = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(i);
        Integer result = list.stream().mapToInt(a->(a*a)).filter(a->(a>64)).reduce(0, (a,b)->(a+b));

        System.out.println(result);

        

    }

}
