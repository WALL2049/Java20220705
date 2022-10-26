package collection_test.list_test;

import java.util.ArrayList;

public class MyArrayList<E> {
    private ArrayList<Object> list = new ArrayList<>();

    public <E> void add(Object o){
        list.add(o);
    }
    public <E> void remove(Object o){
        list.remove(o);
    }
}