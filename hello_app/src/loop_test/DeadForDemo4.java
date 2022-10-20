package loop_test;

import java.util.Scanner;

public class DeadForDemo4 {
    public static void main(String[] args) {
        int rightpassword = 520;
        System.out.println("请输入密码：");
        Scanner sc = new Scanner(System.in);
        while (true){
            int password = sc.nextInt();
            if (password == rightpassword){
                System.out.println("欢迎登陆！");
                break;
            }
            else {
                System.out.println("密码输入错误！请重新输入：");
            }
        }
    }
}
