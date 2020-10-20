package com.leetcode.DataStructure.Array;

// Container With Most Water
// https://leetcode.com/problems/container-with-most-water/

public class MostWater {
    public int maxArea(int[] height) {

        int contHight = 0, result = 0;

        for (int i = 0;  i < height.length - 1; i++) {
            for (int j = i + 1;  j < height.length; j++) {
                if (height[i] > height[j]) {
                    contHight = height[j];
                } else {
                    contHight = height[i];
                }
                if ((j - i) * contHight > result) {
                    result = (j - i) * contHight;
                }
            }
        }

        return result;
    }
}
