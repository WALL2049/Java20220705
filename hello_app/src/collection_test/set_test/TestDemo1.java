package collection_test.set_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

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

        Collection<Integer> list3 = new ArrayList<>();
        list3.add(15);
        list3.add(17);
        list3.add(17);
        list3.add(18);
        list3.add(18);
        list3.remove(18);
        System.out.println(list3);

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