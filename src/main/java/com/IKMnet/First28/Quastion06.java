package com.IKMnet.First28;

import java.util.Locale;
import java.util.ResourceBundle;

public class Quastion06 {

    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Message", new Locale("zh", "CN"));
        String str = resourceBundle.getString("CancelKey");
        System.out.println("CancelKey= " + str);

    }

}
