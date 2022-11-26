package collection_test.list_test.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
//        创建数组，返回数组
        System.out.println(getArray()[3]);
        System.out.println(getArray().length);
//        入参集合，返回集合
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(60);
        scores.add(90);
        scores.add(75);
        scores.add(65);
        scores.add(85);
        scores.add(88);
        System.out.println(scores);
        System.out.println(getArraylist(scores, 80));
//        for (int i = 0; i < scores.size(); i++) {
//            int score = scores.get(i);
//            if (score<80){
//                scores.remove(i);
//                i--;
//            }
//        }
//        System.out.println(scores);
    }

    public static ArrayList<Integer> getArraylist(ArrayList<Integer> scores, int line){
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score<line){
                scores.remove(i);
                i--;
            }
        }
        return scores;
    }

    public static int[] getArray(){
        int[] ages = new int[5];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i + 20;
        }
        return ages;
    }
//    public static ArrayList getarratlist(ArrayList gradelists, int num){
//        for (int i = 0; i < gradelists.length; i++) {
//
//        }
//    }
}
