package package_test;

public class SwitchDemo {
    public static void main(String[] args) {
        int month = 12;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月有31天！");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月有30天！");
                break;
            case 2:
                System.out.println(month + "月有28或29天！");
                break;
            default:
                System.out.println("您输入有误！");
        }
    }
}