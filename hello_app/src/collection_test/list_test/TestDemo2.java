package collection_test.list_test;

import java.util.ArrayList;

public class TestDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("123");
        list.add("wqer");
        list.remove("123");
    }
}