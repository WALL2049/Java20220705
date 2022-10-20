package array_test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTestDemo4 {
    public static void main(String[] args) {
        Random ran = new Random();
        int randomnlist[] = new int[5];
        for (int i = 0; i<5; i++){
            randomnlist[i] = ran.nextInt(20) + 1;
        }
        int index = 0;
        Scanner sc = new Scanner(System.in);
        /*
        boolean值或者break Out跳出while
         */
//        boolean wrong = false;
//        while (wrong == false){
//            System.out.println("数组有5个1-20内的整数，请猜一个数：");
//                int guessnum = sc.nextInt();
//                for (int i = 0; i < 5; i++){
//                    if (guessnum == randomnlist[i]){
//                        System.out.println("您猜对了！");
//                        wrong = true;
//                        index = i;
        Out:
        while (true){
            System.out.println("数组有5个1-20内的整数，请猜一个数：");
            int guessnum = sc.nextInt();
            for (int i = 0; i < 5; i++){
                if (guessnum == randomnlist[i]){
                    System.out.println("您猜对了！");
                    index = i;
                    break Out;
                    }
            }
            System.out.println("猜错了！请再猜一次");
        }
        System.out.println("数组为:");
        for (int i = 0; i < 5; i++){
            System.out.print(randomnlist[i] + "\t");
        }
            System.out.println("\n猜中的数字index为"+ index);
    }
}
