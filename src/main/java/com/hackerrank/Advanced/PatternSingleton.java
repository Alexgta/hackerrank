package com.hackerrank.Advanced;

public class PatternSingleton {

    private static PatternSingleton instance;
    public static String str;
    private PatternSingleton() {}

    static PatternSingleton getSingleInstance() {
        if (instance == null) {
            instance = new PatternSingleton();
        }
        return instance;
    }


}
