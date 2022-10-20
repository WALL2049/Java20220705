package static_code;

import java.util.ArrayList;

public class CardDemo1 {
    // ArrayList用来装牌，这部分应该放在静态属性
    public static ArrayList<String> cards = new ArrayList<>();
    /**
     * 静态代码块，生成54张牌
     */
    static {
        // 数组存储卡牌大小
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
        // 数组存储花色
        String[] colours = {"♣","♥","♦","♠"};
        // 加入52张牌
        for (int i = 0; i < sizes.length; i++) {
            for (int i1 = 0; i1 < colours.length; i1++) {
                String card = sizes[i] + colours[i1];
                cards.add(card);
            }
        }
        // 加入大小王
        cards.add("小🃏");
        cards.add("大🃏");
    }

    public static void main(String[] args) {
        System.out.println("新牌："+cards);
    }


}
