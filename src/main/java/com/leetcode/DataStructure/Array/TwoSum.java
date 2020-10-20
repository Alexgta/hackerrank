package com.leetcode.DataStructure.Array;

/*Input: nums = [2,7,11,15], target = 9
        return indices of the two numbers such that they add up to target.
        Output: [0,1]*/

import java.util.Hashtable;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> numsHash = new Hashtable<>();
        for (int i : nums) {
            numsHash.put(i, i);
        }

        int pairNum;
        for (int i = 0; i < nums.length; i++) {
            pairNum = target - nums[i];
            if (numsHash.containsKey(pairNum)) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == pairNum) {
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {21, 71, 11, 15, 2, 7};
        int[] result = twoSum(nums, 9);

        for (int i : result) {
            System.out.println(i);
        }

    }

}
