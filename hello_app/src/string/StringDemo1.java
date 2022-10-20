package string;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        // 定义政确的loginname和password
        String okLoginName = "zte";
        String okPassword = "Cpa1234Spa";
        // 用户输入
        Scanner sc = new Scanner(System.in);
        // 判断正确与否，5次输入机会
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入用户名：");
            String loginName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if(loginName.equals(okLoginName)){
                if(password.equals(okPassword)){
                    System.out.println("登陆成功！");
                    break;
                }else{
                    System.out.println("密码不正确！您还有"+(4-i)+"次机会！");
                }
            }else{
                System.out.println("该账号不存在！您还有"+(4-i)+"次机会！");
            }
        }
    }
}
