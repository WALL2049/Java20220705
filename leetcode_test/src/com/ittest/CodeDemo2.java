package com.ittest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 双指针取数组相同部分
 */
public class CodeDemo2 {
    public static void main(String[] args) {
        int[] result = intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while((i < nums1.length) && (j < nums2.length)){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] == nums2[j]){
                list1.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[list1.size()];
        for(int k = 0; k < list1.size(); k++){
            result[k] = list1.get(k);
        }

        return result;
    }
}