package com.Test;

public class Test223 {

    // aaabbcca
    // 3a2b2ca

    public static void main(String[] args) {

        String myStr = "aaabbcca";
        int myCount = 0;
        char myChar = '-';

        String result = "";

        if (myStr != null ) {

            for (int i = 0; i < myStr.length(); i++) {
                if (i == 0) {
                    myChar = myStr.charAt(0);
                    myCount = 1;
                } else {

                    if (myChar == myStr.charAt(i)) {

                        myCount++;

                    } else {


                        if (myCount == 1) {
                            result = result + myChar;
                        } else {
                            result = result + myCount + myChar;
                        }

                        myCount = 1;
                        myChar = myStr.charAt(i);

                    }
                }
            }
        }


    }



}
