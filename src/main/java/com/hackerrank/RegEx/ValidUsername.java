package com.hackerrank.RegEx;

import java.util.Scanner;

public class ValidUsername {

    public static void main(String[] args) {

        /*
        1) The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
        2) The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
        3) The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .*/

        String regularExpression = "^[a-zA-Z]\\w{7,29}$";
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}
