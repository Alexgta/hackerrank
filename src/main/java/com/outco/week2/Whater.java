package com.outco.week2;

// find max water between rocks

public class Whater {

    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 50, 0, 56, 0, 2};
        int arrLength = arr.length;

        int[] arrLeft = new int[arrLength];
        int[] arrRight = new int[arrLength];
        int[] arrWater = new int[arrLength];

        int maxLvl = 0;
        for (int i = 0; i < arrLength; i++) {
            if (maxLvl < arr[i])
                maxLvl = arr[i];
            arrLeft[i] = maxLvl;
        }

        maxLvl = 0;
        for (int i = arrLength -1; i >= 0; i--) {
            if (maxLvl < arr[i])
                maxLvl = arr[i];

            arrRight[i] = maxLvl;
        }

        for (int i = 0; i < arrLength; i++) {
            maxLvl = Math.min(arrLeft[i], arrRight[i]) - arr[i];
            if (maxLvl < 0)
                maxLvl = 0;
            arrWater[i] = maxLvl;
            System.out.println(maxLvl);
        }

        boolean keepAdding = false;
        int result = 0;
        int resultTmp = 0;
        for (int i = 1; i < arrLength - 1; i++) {
            if (arrWater[i] == 0) {
                if (resultTmp > result)
                    result = resultTmp;
                resultTmp = 0;
                keepAdding = false;
            } else if (arrWater[i] > 0) {
                if (keepAdding)
                    resultTmp = resultTmp + arrWater[i];
                else {
                    resultTmp = arrWater[i];
                    keepAdding = true;
                }
            }
        }
        System.out.println("Result: " + result);
    }

}
