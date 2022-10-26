package collection_test.list_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CardGame {
    // 1.用一个数组装54张牌
    private static List<Card> allcards = new ArrayList<>();

    // 2.静态代码块，初始化建立牌组：封装牌对象，并加到卡数组里面，另外还要加入大小王
    static {
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colours = {"红桃","黑桃","方块","梅花"};
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String colour : colours) {
                Card card = new Card(size, colour, index);
                allcards.add(card);
            }
        }
        Card c1 = new Card("","大王", ++index);
        Card c2 = new Card("","小王", ++index);
        allcards.add(c1);
        allcards.add(c2);
    }

    public static void main(String[] args) {
        // 3.洗牌
        Collections.shuffle(allcards);
        // 4.每个人建立一个卡牌数组
        List<Card> xiaowang = new ArrayList<>();
        List<Card> liming = new ArrayList<>();
        List<Card> dapeng = new ArrayList<>();
        // 5.发牌
        System.out.println(allcards);
        for (int i = 0; i < allcards.size() - 3; i++) {
            Card c = allcards.get(i);
            if (i % 3 == 1){
                xiaowang.add(c);
            }else if (i % 3 == 2){
                liming.add(c);
            }else if (i % 3 == 0){
                dapeng.add(c);
            }
        }
        // 3张底牌
        List<Card> arr = allcards.subList(allcards.size()-3, allcards.size());
        System.out.println("三张底牌：" + arr);
        // 6.给每个人的牌排序
        sortCards(xiaowang);
        sortCards(liming);
        sortCards(dapeng);
        System.out.println("小王的牌：" + xiaowang);
        System.out.println("李明的牌：" + liming);
        System.out.println("大鹏的牌：" + dapeng);

        // Collection的stream练习
        System.out.println(allcards.stream().filter(s -> s.toString().startsWith("黑桃")).count());
//        allcards.stream().filter(s -> s.toString().endsWith("2")).forEach(s -> System.out.println(s));
        allcards.stream().filter(s -> s.toString().endsWith("2")).forEach(System.out::println);
        allcards.stream().filter(s -> s.toString().endsWith("A")).map(s -> "测试stream：" + s).forEach(System.out::println);
        long size = allcards.stream().filter(s -> s.toString().endsWith("A")).map(s -> s.toString().length() == 3).count();
        System.out.println(size);
        allcards.stream().filter(s -> s.toString().startsWith("方块")).limit(3).forEach(System.out::println);
        allcards.stream().filter(s -> s.toString().startsWith("方块")).skip(1).forEach(System.out::println);
        Stream<String> s1 = Stream.of("Java", "HTML");
        Stream<String> s2 = Stream.of("Python", "VUE");
//        s1.forEach(System.out::println);
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);










    }

    //    public static void sortCards(List<Card> cards){
//        Collections.sort(cards, new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                return o2.getIndex() - o1.getIndex();
//            }
//        });
//    }
    public static void sortCards(List<Card> cards){
        Collections.sort(cards, (o1, o2) -> o2.getIndex() - o1.getIndex());
    }

}