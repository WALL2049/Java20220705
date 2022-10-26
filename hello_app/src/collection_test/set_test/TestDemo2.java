package collection_test.set_test;

import java.util.*;

public class TestDemo2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("MySQL");
        set.add("HTML");
        set.add("springboot");
        set.add("HTML");
        set.add("redis");
        System.out.println(set);
        Set<String> set2 = new HashSet<>();

        Collections.addAll(set2, "及时雨","智多星","小李广","玉麒麟");
        System.out.println(set2);
        set2.addAll(set);

        System.out.println(set2);
        System.out.println(set.hashCode());
    }
}