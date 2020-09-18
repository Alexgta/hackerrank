package com.hackerrank.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.printf("%s=%s%n", s, phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

    }

}
