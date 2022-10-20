package collection_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;

public class CollectionTestDemo1 {
    public static void main(String[] args) {
        int[] ages = {17, 18, 18, 19};
        System.out.println(ages);

        Collection<Integer> list1 = new ArrayList<>();
        Collection<Double> set1 = new HashSet<>();
        System.out.println(list1.getClass());
        System.out.println(set1.getClass());
        list1.add(18);
        list1.add(18);
        list1.add(18);
        list1.add(20);
        list1.add(30);
        set1.add(18.8);
        set1.add(18.8);
        set1.add(18.8);
        set1.add(26.9);
        set1.add(36.67);
        System.out.println(list1);
        System.out.println(set1);

//        list1.clear();
//        System.out.println(list1);
//        System.out.println(c1.isEmpty());
//        System.out.println(c1.size());
//        System.out.println(c2.contains(50.456));
//        System.out.println(c2.contains(50.56));
//        for (Integer c : c1) {
//            System.out.println(c);
//        }
//        for (Double c : c2) {
//            System.out.print(c+"\t");
//        }
//        c2.forEach(new Consumer<Double>() {
//            @Override
//            public void accept(Double c) {
//                System.out.println(c);
//            }
//        });
//        c2.forEach((c)-> System.out.println(c));


    }
}
