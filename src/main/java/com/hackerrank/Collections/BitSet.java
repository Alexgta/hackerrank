package com.hackerrank.Collections;

import java.util.Scanner;

public class BitSet {

    public static void main(String[] args) {
        /*The M subsequent lines each contain an operation in one of the following forms:
        AND     <set> <set>
        OR      <set> <set>
        XOR     <set> <set>
        FLIP    <set> <index>
        SET     <set> <index>*/
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        int m = get.nextInt();

        /*BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitset = new BitSet[3];

        bitset[1] = b1;
        bitset[2] = b2;

        while ( 0 < m-- ) {
            String op = get.next();
            int x = get.nextInt();
            int y = get.nextInt();

            switch (op) {
                case "AND":
                    bitset[x].and(bitset[y]);
                    break;
                case "OR":
                    bitset[x].or(bitset[y]);
                    break;
                case "XOR":
                    bitset[x].xor(bitset[y]);
                    break;
                case "FLIP":
                    bitset[x].flip(y);
                    break;
                case "SET":
                    bitset[x].set(y);
            }

            System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());

        }*/
    }

}
