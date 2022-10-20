package api_test;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays_Test {
    public static void main(String[] args) {
//        Integer[] ages = new Integer[]{12, 45, 38, 25, 74, 6, 22};
        Integer[] ages = {12, 45, 38, 25, 74, 6, 22};
        // 原函数
//        Arrays.sort(ages, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        // lambda表达式
//        Arrays.sort(ages, (Integer o1, Integer o2) -> {
//            return o2 - o1;
//        });
        // 简化
        Arrays.sort(ages, (o1, o2) -> o2 - o1);


        System.out.println(Arrays.toString(ages));
    }
}
