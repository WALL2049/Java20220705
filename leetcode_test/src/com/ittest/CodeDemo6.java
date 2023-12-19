package com.ittest;

import java.util.Arrays;

/**
 * 单词倒置
 */
public class CodeDemo6 {
    public static void main(String[] args) {
        char[] arr = new char[]{'h','e','l','l','o'};
        testfun(arr);
        System.out.println(Arrays.toString(arr));
//        String a = "今天天气比较冷！对吗？";
//        String b = a.substring(2,5);
//        System.out.println(b);
//        System.out.println(a);
//        char c ='a';
//        System.out.println(c);
    }

    public static void testfun(char[] arr){
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}