package package_test;

public class IfDemo {
    public static void main(String[] args) {
        int heartspeed = 170;
        if(heartspeed < 60 || heartspeed > 90){
            System.out.println("你的心率为" + heartspeed + "，建议进一步检查！");
        } else {
            System.out.println("您的检查结果正常！");
        }
        System.out.println("检查完毕！");

        System.out.println("-----------------------------");

        double money = 1324;
        if(money >= 1314){
            System.out.println("可以发送1314红包，您的余额为" + money);
        } else if(money>= 520 && money < 1314){
            System.out.println("可以发送520红包，您的余额为" + money);
        } else if(money < 520 && money > 0){
            System.out.println("您的余额不足！您的余额为" + money);
        } else if(money == -666){
            System.out.println("您的余额为-666！");
        } else {
            System.out.println("余额数有误！");
        }
    }
}