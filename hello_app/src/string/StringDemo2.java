package string;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        phonenumber();
    }
    public static void phonenumber(){
        //        用户输入号码
        System.out.println("请输入手机号码：");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
//        substring截取
        String left = number.substring(0,3);
        String right = number.substring(7);
        String result = left + "****" + right;
        System.out.println(result);
    }
}
