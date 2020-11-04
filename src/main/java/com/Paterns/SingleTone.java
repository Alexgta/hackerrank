package com.Paterns;


public class SingleTone {

    private static SingleTone instanse;
    private SingleTone() {};

    public static SingleTone getInstance() {
        if (instanse == null) {
            instanse = new SingleTone();
        }
        return instanse;
    }

}
