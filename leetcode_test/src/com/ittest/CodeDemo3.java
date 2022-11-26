package com.ittest;


import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
 * 找出那个只出现了一次的元素。
 */
public class CodeDemo3 {
    public static void main(String[] args) {
        int result = singleNumber(new int[]{4, 1, 2, 1, 2});
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums){
            if(!set1.add(num)){
                set1.remove(num);
            }
        }
        return (int)set1.toArray()[0];
    }
}