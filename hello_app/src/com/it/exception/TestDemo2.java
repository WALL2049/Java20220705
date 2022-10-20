package com.it.exception;

import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("请输入价格，必须为正数：");
                // 直接 Double db = sc.nextdouble(); 会有bug,无限循环
                String price = sc.nextLine();
                Double db = Double.valueOf(price);
                // 判断价格是否大于0
                if (db > 0){
                    System.out.println("商品的价格为"+ db +"元");
                    break;
                }else {
                    System.out.println("价格必须为正数");
                }
            } catch (Exception e) {
                System.out.println("输入的数据有问题，请输入合法数值！！！");
            }
        }
    }
}
