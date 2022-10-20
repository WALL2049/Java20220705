package com.it.exception;

import java.util.*;

public class TestDemo1 {
    public static void main(String[] args) {
        System.out.println("--------begin----------");
        try {
            run();
            System.out.println("--------程序运行成功----------");
            System.out.println("--------程序运行失败----------");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("--------end----- -----");


    }

    public static void run() throws RuntimeException{
        List<Integer> list = new ArrayList<>();
        Set<Double> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        Collections.addAll(list, 1,2,2,3);
        Collections.addAll(set, 1.1,2.2,2.2,3.3);
        map.put("apple", 2);
        System.out.println(list.get(4));
    }
}
