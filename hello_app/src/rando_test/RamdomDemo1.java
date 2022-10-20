package rando_test;

import java.util.Random;
import java.util.Scanner;

public class RamdomDemo1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int luckynum = ran.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("1-100以内，请任意猜一个数字：");
        while (true){
            int guessnum = sc.nextInt();
            if (guessnum > luckynum){
                System.out.println("您输入的值太大了！请再猜一次：");
            }
            else if (guessnum < luckynum){
                System.out.println("您输入的值太小了！请再猜一次：");
            }
            else if (guessnum == luckynum){
                System.out.println("您猜对了！");
                break;
            }
            else {
                System.out.println("您猜的值有误，请再猜一次：");
            }
        }
    }
}
