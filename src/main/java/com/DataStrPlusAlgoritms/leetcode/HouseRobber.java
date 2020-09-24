package com.DataStrPlusAlgoritms.leetcode;

import java.util.HashMap;

public class HouseRobber {
    // House Robber
    int[] MaxSumHouse;
    HashMap<Integer, Integer> resultMap;

    public int rob(int[] nums) {
        MaxSumHouse = new int[nums.length];
        resultMap = new HashMap<>();
        return MaxSum(nums, 0);
    }

    private int MaxSum(int[] nums, int i) {
        int sum1;
        int sum2;
        int lgth = nums.length;

        if (resultMap.containsKey(i)) {
            return resultMap.get(i);
        }

        if (lgth - i <= 0)
            return 0;
        else if (lgth - i == 1)
            return nums[i];
        else if (lgth -i == 2)
            return Math.max(nums[i], nums[i + 1]);
        else {
            sum1 = nums[i] + MaxSum(nums, i + 2);
            sum2 = nums[i + 1] + MaxSum(nums, i + 3);
        }
        resultMap.put(i, Math.max(sum1, sum2));
        return Math.max(sum1, sum2);
    }

    public int robEvgenyi(int[] nums) {
        MaxSumHouse = new int[nums.length];
        return MaxSumEvgenyi(nums, 0, -2);
    }

    private int MaxSumEvgenyi(int[] nums, int sum, int i) {
        int N = nums.length;
        if (i + 2 >= N)
            return sum;
        if (i + 2 == N - 1)
            return sum + nums[i + 2];
        if (i >= 0 && sum <= MaxSumHouse[i])
            return 0;

        int sum2 = sum + nums[i + 2];
        int s2 = MaxSumEvgenyi(nums, sum2, i + 2);
        if (sum2 > MaxSumHouse[i + 2])
            MaxSumHouse[i + 2] = sum2;
        int sum3 = sum + nums[i + 3];
        int s3 = MaxSumEvgenyi(nums, sum3, i + 3);
        if (sum3 > MaxSumHouse[i + 3])
            MaxSumHouse[i + 3] = sum3;

        return Math.max(s2, s3);
    }

}
