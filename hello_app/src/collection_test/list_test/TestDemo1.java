package collection_test.list_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class TestDemo1 {
    public static void main(String[] args) {
////        ArrayList<Integer> list1 = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(5);
//        list1.add(5);
//        list1.add(55);
//        list1.add(555);
//        list1.add(5555);
//        System.out.println(list1);
//        list1.add(2,123);
//        System.out.println(list1);
//        list1.remove(3);
//        System.out.println(list1);
//        for (Integer integer : list1) {
//            System.out.println(integer);
//        }
//        System.out.println(list1.get(3));
//        list1.set(0,2);
//        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(5);
        list2.add(55);
        list2.add(555);
        list2.add(5555);
        System.out.println(list2);
        list2.push(100);
        list2.push(1000);
        System.out.println(list2);
        Collections.shuffle(list2);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        list2.pop();
        System.out.println(list2);
        System.out.println(list2.getFirst());
        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }
}