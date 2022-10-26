package map_test;

import java.util.*;

public class TestDemo1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Set<Double> set1 = new HashSet<>();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
//        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("鸿星尔克", 2);
        map1.put("安踏", 3);
        map1.put("匹克", 4);
        map1.put("斐乐", 5);
        System.out.println(map1.get("安踏"));
        System.out.println(map1.get("NIKE"));
        System.out.println(map1.containsKey("NIKE"));
        System.out.println(map1.containsValue(3));
        System.out.println(map1);
        Set<String> keys = map1.keySet();
        System.out.println(keys);
        Collection<Integer> values = map1.values();
        System.out.println(values);
        System.out.println("---------------------");
        for (String key : keys) {
            int value = map1.get(key);
            System.out.println(key + "=====>" + value);
        }
        System.out.println("---------------------");
//        map1.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String k, Integer v) {
//                System.out.println(k + "------>" + v);
//            }
//        });
        map1.forEach((k, v) -> System.out.println(k + "------>" + v));

//        System.out.println("---------------------");
//        map1.remove("安踏");
//        System.out.println(map1);
//        map1.clear();
//        System.out.println(map1.isEmpty());
//        System.out.println(map1);
//        map1.putAll(map2);


    }
}