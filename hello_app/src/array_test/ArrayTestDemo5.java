package array_test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTestDemo5 {
    public static void main(String[] args) {
        int numlist[] = new int[5];
//        numlist[0] = 10;
//        numlist[1] = 20;
//        numlist[2] = 30;
//        numlist[3] = 40;
//        numlist[4] = 50;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numlist.length; i++){
            System.out.println("请输入第" + (i+1) + "个员工的工号:");
            numlist[i] = sc.nextInt();
        }

        Random rd = new Random();
        for (int i = 0; i < numlist.length; i++){
//            boolean choose = true;
            while (true){
                int j = rd.nextInt(numlist.length);
                if (i != j){
                    int temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                    break;
                }
            }
        }
        System.out.println("随机排序后的工号顺序为：");
        for (int i = 0; i < numlist.length; i++){
            System.out.print(numlist[i] + "\t");
        }
    }
}
