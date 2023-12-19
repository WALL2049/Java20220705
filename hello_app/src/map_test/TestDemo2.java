package map_test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map相关操作
 */
public class TestDemo2 {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Kobe", 8);
        map.put("Jordan", 23);
        map.put("James", 6);
        map.put("Curry",30);
        map.put("Durant",35);
        System.out.println(map);
        System.out.println( "------------" );

        //通过keySet()获取key，再通过map.get(key)获取value
        Set<String> set = map.keySet();
        System.out.println(set);
        for(String str : set) {
            System.out.println(str + " " + map.get(str));
        }
        System.out.println( "------------" );

        //通过map.entrySet()获得键值对，性能较高
        Set<Map.Entry<String, Integer>> en = map.entrySet();
        System.out.println(en);
        for(Map.Entry<String, Integer> entry : en) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println( "------------" );

        //通过values()取值
        Collection<Integer> values = map.values();
        for(Integer i : values)
            System.out.println(i);
    }
}