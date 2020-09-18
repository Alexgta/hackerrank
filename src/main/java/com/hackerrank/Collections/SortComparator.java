package com.hackerrank.Collections;


import java.util.Scanner;

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker extends SortComparator {

    public int compare(Player a, Player b){
        if (a.score == b.score){
            return a.name.compareTo(b.name);//alphabetically
        } else {
            return b.score - a.score;//decreasing
        }
    }
}

public class SortComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        /* SHould work:
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }*/
    }

}
