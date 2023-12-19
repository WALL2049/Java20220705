package com.ittest;

import java.util.Arrays;

/**
 * 数组加一并返回
 */
public class CodeDemo7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9})));
        int[] list = new int[10];
        System.out.println(list[-1]);
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i = length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] list2 = new int[length+1];
        list2[0] = 1;
        return list2;

    }
}