package com.ittest;


import java.util.Arrays;

/**
 * 数组向右移动三位
 */
public class CodeDemo1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}


class Solution {
    public void rotate(int[] nums, int k) {
        int[] newNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int j = (i + k) % (nums.length);
            newNums[j] = nums[i];
        }
        System.out.println(Arrays.toString(newNums));
    }
}