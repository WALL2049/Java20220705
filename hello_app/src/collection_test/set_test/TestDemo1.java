package collection_test.set_test;

import java.util.*;

public class TestDemo1 {
    public static void main(String[] args) {
        Collection list1 = new ArrayList();
        list1.add(12);
        list1.add(12);
        list1.add("ab");
        list1.add("ab");
        list1.add("好的");
        list1.add(12.12);
        list1.add(12.12);
        list1.remove("12");
        System.out.println(list1);
        System.out.println("--------------------------");

        Collection list2 = new HashSet();
        list2.add(12);
        list2.add(12);
        list2.add("ab");
        list2.add("ab");
        list2.add("好的");
        list2.add(12.12);
        list2.add(12.12);
        list2.add("dgsgsd");
        list2.add(32423);
        Collections.addAll(list2, "123","123124.0");
        list2.remove(12);
        System.out.println(list2);
        System.out.println("--------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.add(15);
        list3.add(17);
        list3.add(17);
        list3.remove(2);
        System.out.println(list3);
        Collections.addAll(list3, 18,18,11,111,22);
        System.out.println(list3);
        list3.get(5);
        list3.add(3,33);
        System.out.println(list3);
        list3.set(5, 56789);
        System.out.println(list3);
        list3.remove(5);
        System.out.println(list3);
        System.out.println(list3);
        System.out.println("--------------------------");

        Collection<Double> list4 = new HashSet<>();
        list4.add(15.5);
        list4.add(17.7);
        list4.add(17.7);
        list4.add(18.8);
        list4.add(18.8);
        list4.remove(18.8);
        System.out.println(list4);



    }
}