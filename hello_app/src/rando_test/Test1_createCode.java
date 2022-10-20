package rando_test;

import java.util.Random;

public class Test1_createCode {
    public static void main(String[] args) {
        String result = createCode(6);
        System.out.println(result);

    }
//  建立createCode方法生成验证码
    public static String createCode(int n){
//  建立code字符串，并通过循环分别生成每一位
        String code = "";
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
//  通过随机type，决定是大写字母0，小写字母1还是数字2,
            int type = rd.nextInt(3);
            switch (type){
                case 0:   //大写字母
                    char ch0 = (char) (rd.nextInt(25) +65);
                    code += ch0;
                    break;
                case 1:   //小写字母
                    char ch1 = (char) (rd.nextInt(25) +97);
                    code += ch1;
                    break;
                case 2:   //数字
                    int ch2 =  rd.nextInt(9) ;
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
